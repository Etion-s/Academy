package Part6.ExQ.Member;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong","12345");
        if (result){
            System.out.println("로");
        }
    }
}
