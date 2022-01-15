package Part6.ExQ.Member;

public class MemberService {
    Member user1 = new Member("you","1234");
    public boolean login(String id, String password){
        if (id.equals(user1.name) && password.equals(user1.password)){
            return true;
        } else
            return false;
    }

    public void logout() {
        System.out.println("Logout...");
    }
}
