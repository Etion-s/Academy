package net.smboard.member.dao;

import net.smboard.member.model.MemberModel;

public interface MemberDao {
	boolean addMember(MemberModel memberModel);
	MemberModel findByUserId(String userId);
}