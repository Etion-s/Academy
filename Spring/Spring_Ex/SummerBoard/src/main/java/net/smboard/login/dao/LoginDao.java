package net.smboard.login.dao;

import net.smboard.login.model.LoginSessionModel;

public interface LoginDao {	
	LoginSessionModel checkUserId(String userId);
}