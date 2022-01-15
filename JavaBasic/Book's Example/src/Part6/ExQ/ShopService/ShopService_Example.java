package Part6.ExQ.ShopService;

public class ShopService_Example {
    public static void main(String[] args) {
        ShopService s1 = ShopService.getInstance();
        ShopService s2 = ShopService.getInstance();

        if (s1 == s2){
            System.out.println("Same Adress by singleton");
        } else
            System.out.println("No Same Adress");
    }
}
