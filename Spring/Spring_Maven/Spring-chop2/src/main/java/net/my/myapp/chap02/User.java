package net.my.myapp.chap02;

public class User {
	// User��� ��ü�� �ʵ�� id�� password�� �ִ�
	private String id;
	private String password;
	
	//User��� Ŭ������ ������ �� ���� �Ķ���͸� �ʵ尪�� �����Ѵ�
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	// privateó�� �� �ʵ�(id)�� �ٸ� Ŭ�������� ����� �� �ְ� getId�� ����Ѵ�
	public String getId() {
		return id;
	}

	// matchPassword��� �޼��带 ����� �� ���� �Ķ���� ���̶� ���� ���ʵ� ���̶� ���ؼ� boolean�� ����
	// �Ѵ�
	public boolean matchPassword(String inputPasswd) {
		return password.equals(inputPasswd); // ��ġ�ϸ� true
	}
	
	// �޼��带 ����ҋ� ��������� ���ο� ����� �Է¹޴´�
	// ���� matchPassword�� ���� ����,�� �����ȣ�� �ٸ��� ���� !���� ���� if�� ����ȴ�
	// �׸��� �����޼��� ����Ѵ�
	// if���� �ɸ��� ������ �� �ʵ忡 ���ο� ��й�ȣ�� �����Ѵ�
	public void changePassword(String oldPassword, String newPassword) {
		if (!matchPassword(oldPassword))
			throw new IllegalArgumentException("illegal PassWord");
		password = newPassword;
	}
	
}
