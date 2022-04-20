package net.my.myapp.chap02;

public class PasswordChangeService {

	private UserRepository userRepository;

	public PasswordChangeService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void changePassword(String userId, String oldPw, String newPw) {
		User user = userRepository.findUserById(userId);
		if (user == null)
			throw new UserNotFoundException();

		user.changePassword(oldPw, newPw);
	}

	// 원래라면 여기에 setuserRepostiry가 있어야 하는데 없다
	// 그이유는 config.xml에서 DI주입을 했기 때문이다
}