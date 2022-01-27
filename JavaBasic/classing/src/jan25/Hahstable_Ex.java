package jan25;
import java.util.*;

public class Hahstable_Ex {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("spring", "1");
        map.put("summer", "2");
        map.put("fall", "3");
        map.put("winter", "4");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter ID & PW");
            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("PW: ");
            String pw = sc.nextLine();
            System.out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(pw)) {
                    System.out.println("Login Ok");
                    break;
                } else{
                    System.out.println("Retry PW!");
                }
            } else{
                System.out.println("No ID!!!");
            }

        }
    }
}
