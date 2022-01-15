package Part6.ExQ.ShopService;

public class ShopService {
    //필드 생성
    private static ShopService singleton = new ShopService();

    // 생성자
    private ShopService() {}

    // 메소드
    static ShopService getInstance() {
        return singleton;
    }
}
