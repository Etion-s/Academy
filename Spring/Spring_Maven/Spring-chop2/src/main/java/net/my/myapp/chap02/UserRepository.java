package net.my.myapp.chap02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
	// userMap�̶�� ������ Map�� ���� �޴´�
	private Map<String, User> userMap = new HashMap<String,User>();
	
	// �Ķ���ͷ� ���� id�� ���ؼ� userMap�� value�� User��ü�� ���� �����Ѵ�
	// userMap�� Map (Ű=String, ����=User)�̴�
	public User findUserById(String id) {
		return userMap.get(id);
	}
	
	// �Ķ���ͷ� ���� users�� ���� foreach���� Ȱ���ؼ� �Ķ������ id���� key�� User��ü�� �ǹ��ϴ� u�� vlaue�� �Ѵ�
	// u�� User��ü�̱� ������ getId()��밡��
	public void setUsers(List<User> users) {
		for (User u : users)
			userMap.put(u.getId(), u);
	}
}
