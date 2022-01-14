package jan13.Ex_abstract;

public class Animal_Driver {
    public static void main(String[] args) {
        // 일반적인 표현방법, 각자의 객체를 불러와서 사용
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.print(dog.kind+"   ");
        dog.sound();
        System.out.print(cat.kind+"   ");
        cat.sound();
        System.out.println("================");

        // Animal타입 변수 animal을 선언, 이 변수에 자식객체를 생성하여 override된 메소드 사용
        Animal animal = null;
        animal = new Dog();
        System.out.print(animal.kind+"   ");
        animal.sound();
        animal = new Cat();
        System.out.print(animal.kind+"   ");
        animal.sound();
        System.out.println("================");

        // animalSound메소드의 파라메터는 Animal타입의 객체를 받음. 메소드 호출시 인자 값으로 Animal의 자식객체들을 주어서 다형성 완료.
        animalSound(new Dog());
        animalSound(new Cat());



    }
    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
