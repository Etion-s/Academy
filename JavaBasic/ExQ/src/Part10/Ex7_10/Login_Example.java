package Part10.Ex7_10;

public class Login_Example {
    public static void main(String[] args) {
        try{
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void login(String id, String pw) throws NotExistIDException, WrongPasswordException{
        if (!id.equals("blue")){
            throw new NotExistIDException("아이디 존재 x");
        }
        if (!pw.equals("12345")){
            throw new WrongPasswordException("비밀번호 x");
        }
    }
}
