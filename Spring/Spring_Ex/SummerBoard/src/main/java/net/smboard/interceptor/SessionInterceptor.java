package net.smboard.interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class SessionInterceptor extends HandlerInterceptorAdapter{
	@Override
	// 컨트롤러 실행전
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// check variable
		Object userId = request.getSession().getAttribute("userId");
		// request.getSession() : 세션얻기
		// 즉 userId의 존재 여부 확인 -> 없으면 로그인 x
		
		// pass through when access login.do, join.do
		if(request.getRequestURI().equals("/SummerBoard/login.do") || request.getRequestURI().equals("/SummerBoard/member/join.do")){
			if(userId != null){ 
				response.sendRedirect(request.getContextPath() + "/board/list.do");
				return true;
			} else {
				return true;
			}
		}
		//
		// where other pages		
		if(userId == null){ // 로그인 된 사람들이 회원가입을 하려고 할떄
			response.sendRedirect(request.getContextPath() + "/login.do");
			return false;
		} else { // 로그인 안된사람들 -> 요청되기전에 인터셉트해서 로그인창으로!
			return true;
		}
		//		
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}
}