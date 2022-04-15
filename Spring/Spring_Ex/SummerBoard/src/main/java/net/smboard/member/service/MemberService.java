package net.smboard.member.service;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import net.smboard.member.dao.MemberDao;
import net.smboard.member.model.MemberModel;

public class MemberService implements MemberDao{
	private SqlMapClientTemplate sqlMapClientTemplate;
	
	public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}

	@Override
	public boolean addMember(MemberModel memberModel) {
		sqlMapClientTemplate.insert("member.addMember", memberModel); // addMember 쿼리문을 통해 나온 결과 값인 membermodel을
																	  // insert()를 이용해서 Template에 저장한다	
		MemberModel checkAddMember = findByUserId(memberModel.getUserId()); // findByUserId는 member.xml에서 설정하였다. 그리고 밑의 메소드가 Override한것을 사용한다
																			// checkAddMember에는 UserId를 활용해 가져온 정보들이 저장된다
		
		//check addMember Process
		if(checkAddMember == null){ // 만약 가져온 정보들이 아무것도 없으면
			return false;
		} else {
			return true;
		}
	}
	// addMemeber메소드는 먼저 회원정보가 있는지 확인을 한다. 정보가 없으면 false를 리턴하고, 있으면 true를 리턴한다
	
	@Override
	public MemberModel findByUserId(String userId) {
		return (MemberModel) sqlMapClientTemplate.queryForObject("member.findByUserId", userId);
	}

}