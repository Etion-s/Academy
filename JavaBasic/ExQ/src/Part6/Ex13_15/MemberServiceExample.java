package Part6.Ex13_15;

public class MemberServiceExample {
    public static void main(String[] args) {
        MemberService m1 = new MemberService();
        boolean result = m1.login("hong", "12345");
        if (result){
            System.out.println("로그인 되었습니다");
            System.out.println("=========작업중===========");
            m1.logout("hong");
        } else {
            System.out.println("id or pw 불일치");
        }
    }
}
