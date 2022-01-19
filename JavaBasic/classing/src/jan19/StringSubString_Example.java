package jan19;

public class StringSubString_Example {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        //            01234567890123

        String fisrtNum = ssn.substring(0,6); // 실제 인덱스 0~5까지
        System.out.println(fisrtNum);
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
