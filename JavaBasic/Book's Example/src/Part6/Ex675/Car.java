package Part6.Ex675;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car() {
        this("쏘나타", "빨강", 200);
    }
    Car(String model){
        this(model, "보라", 111);
    }
    Car(String model, String color) {
        this(model, color, 300);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
