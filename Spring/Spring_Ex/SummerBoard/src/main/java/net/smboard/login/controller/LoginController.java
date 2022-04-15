package net.smboard.login.controller;

import javax.servlet.http.HttpSession;

import net.smboard.login.model.LoginSessionModel;
import net.smboard.login.service.LoginService;
import net.smboard.login.service.LoginValidator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	private ApplicationContext context;
	
	@RequestMapping("/login.do") //GET
	public String login() {		
		return "/board/login";
	}
	
	@RequestMapping(value="/login.do", method = RequestMethod.POST)
	public ModelAndView loginProc(@ModelAttribute("LoginModel") LoginSessionModel loginModel, BindingResult result, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		// html에서 받은 값들을 파라미터loginMoel로 받는다

		// form validation
		new LoginValidator().validate(loginModel, result);
		if(result.hasErrors()){
			mav.setViewName("/board/login");
			return mav;
		}
		
		String userId = loginModel.getUserId();
		String userPw = loginModel.getUserPw();
	
		context = new ClassPathXmlApplicationContext("/config/applicationContext.xml"); // 매개변수를 넣어주는 xml을 수동으로 스프링컨테이너를 만들어준다
		// 사용 이유 : 로그인 할때 DB를 사용하기 위해서
		LoginService loginService = (LoginService) context.getBean("loginService");
		LoginSessionModel loginCheckResult = loginService.checkUserId(userId);

		//데이터가 없음 check joined user
		if(loginCheckResult == null){
			mav.addObject("userId", userId);
			mav.addObject("errCode", 1);	// not exist userId in database
			mav.setViewName("/board/login");			
			return mav; 
		}
		
		//데이터가 있다 check password
		if(loginCheckResult.getUserPw().equals(userPw)){			
			session.setAttribute("userId", userId);
			session.setAttribute("userName", loginCheckResult.getUserName());
			mav.setViewName("redirect:/board/list.do");
			return mav;
		} else { // 비번이 틀림
			mav.addObject("userId", userId);
			mav.addObject("errCode", 2);	// not matched password
			mav.setViewName("/board/login");			
			return mav;  
		}	
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		return "redirect:login.do";
	}
}