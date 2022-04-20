package net.my.myapp.chap02;

public class AuthenticationService {

	// 외부클래스를 객체로 하는 필드생성
	private UserRepository userRepository;
	private AuthFailLogger failLogger;

	// authenticate = 진짜임을 증명하다
	// 파라미터로 id와 password (String)을 받는다
	// findUserById는 리턴값으로 User를 리턴한다
	// id를 통해 가져온 User가 없으면 작성한에러출력
	// 
	public AuthInfo authenticate(String id, String password) {
		User user = userRepository.findUserById(id);
		if (user == null)
			throw new UserNotFoundException();

		// 현재 user는 id를 통해 가져온 User이다
		if (!user.matchPassword(password)) {
			failLogger.insertBadPw(id, password);
			throw new AuthException();
		}

		return new AuthInfo(user.getId());
	}


	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void setFailLogger(AuthFailLogger failLogger) {
		this.failLogger = failLogger;
	}

}
