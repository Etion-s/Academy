package net.my.myapp.chap02;

//Auth = 인증 = 관리자 에 관한 정보
public class AuthInfo {
	
	private String id;
	
	//AuthInfo 메서드는 받은 id를 필드 id에 저장한다
	public AuthInfo (String id) {
		this.id = id;
	}
	
	// getId()는 필드에 저장된 id를 리턴한다
	public String getId() {
		return id;
	}
}
