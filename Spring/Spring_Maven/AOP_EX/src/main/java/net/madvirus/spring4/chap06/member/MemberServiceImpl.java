package net.madvirus.spring4.chap06.member;

public class MemberServiceImpl implements MemberService {

	@Override
	public void regist(MemberRegRequest memberRegReq) {
		System.out.println("MemberServiceImpl.regist() ȣ���");
	}
}