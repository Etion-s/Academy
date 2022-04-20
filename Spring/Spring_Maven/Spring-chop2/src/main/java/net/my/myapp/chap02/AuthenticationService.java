package net.my.myapp.chap02;

public class AuthenticationService {

	// �ܺ�Ŭ������ ��ü�� �ϴ� �ʵ����
	private UserRepository userRepository;
	private AuthFailLogger failLogger;

	// authenticate = ��¥���� �����ϴ�
	// �Ķ���ͷ� id�� password (String)�� �޴´�
	// findUserById�� ���ϰ����� User�� �����Ѵ�
	// id�� ���� ������ User�� ������ �ۼ��ѿ������
	// 
	public AuthInfo authenticate(String id, String password) {
		User user = userRepository.findUserById(id);
		if (user == null)
			throw new UserNotFoundException();

		// ���� user�� id�� ���� ������ User�̴�
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
