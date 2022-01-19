package jan19;

public class StringCaht_Example {
    public static void main(String[] args) {
        String ssn = "010624-1230123";
        char sex = ssn.charAt(7); // -뒤에 있는 1을 리턴
        switch (sex){
            case '1':
            case '3':
                System.out.println("Male");
                break;
        }
    }
}
