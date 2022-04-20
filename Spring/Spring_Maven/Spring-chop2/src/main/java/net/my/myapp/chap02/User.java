package net.my.myapp.chap02;

public class User {
	// User라는 객체의 필드는 id와 password가 있다
	private String id;
	private String password;
	
	//User라는 클래스를 생성할 때 받은 파라미터를 필드값에 대입한다
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// private처리 된 필드(id)를 다른 클래스에서 사용할 수 있게 getId를 사용한다
	public String getId() {
		return id;
	}

	// matchPassword라는 메서드를 사용할 때 받은 파라미터 값이랑 현재 내필드 값이랑 비교해서 boolean을 리턴
	// 한다
	public boolean matchPassword(String inputPasswd) {
		return password.equals(inputPasswd); // 일치하면 true
	}
	
	// 메서드를 사용할떄 옛날비번과 새로운 비번을 입력받는다
	// 위의 matchPassword의 값이 거짓,즉 비빌번호가 다르면 앞의 !으로 인해 if문 실행된다
	// 그리고 에러메세지 출력한다
	// if문에 걸리지 않으면 내 필드에 새로운 비밀번호를 대입한다
	public void changePassword(String oldPassword, String newPassword) {
		if (!matchPassword(oldPassword))
			throw new IllegalArgumentException("illegal PassWord");
		password = newPassword;
	}
	
}
