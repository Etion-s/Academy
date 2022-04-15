package net.smboard.login.service;

import org.springframework.orm.ibatis.SqlMapClientTemplate;
import net.smboard.login.dao.LoginDao;
import net.smboard.login.model.LoginSessionModel;

public class LoginService implements LoginDao {
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}
	// Spring 컨텍스트에 객체를 생성한다

	@Override //LoginDao오버라이딩
	public LoginSessionModel checkUserId(String userId) {
		return (LoginSessionModel) sqlMapClientTemplate.queryForObject("login.loginCheck", userId);
	}
	
}