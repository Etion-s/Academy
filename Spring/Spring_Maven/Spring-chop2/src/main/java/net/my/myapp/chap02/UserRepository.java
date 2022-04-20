package net.my.myapp.chap02;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
	// userMap이라는 변수는 Map을 리턴 받는다
	private Map<String, User> userMap = new HashMap<String,User>();
	
	// 파라미터로 받은 id를 통해서 userMap의 value인 User객체의 값을 리턴한다
	// userMap은 Map (키=String, 벨류=User)이다
	public User findUserById(String id) {
		return userMap.get(id);
	}
	
	// 파라미터로 받은 users를 통해 foreach문을 활용해서 파라미터의 id값을 key로 User객체를 의미하는 u를 vlaue로 한다
	// u는 User객체이기 때문에 getId()사용가능
	public void setUsers(List<User> users) {
		for (User u : users)
			userMap.put(u.getId(), u);
	}
}
