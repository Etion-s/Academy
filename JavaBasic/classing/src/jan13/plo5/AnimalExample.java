package jan13.plo5;

public class AnimalExample {
    public static void main(String[] args) {
        // 1번 방법
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.print(dog.kind + " " );
        dog.sound();
        System.out.print(cat.kind + " " );
        cat.sound();
        System.out.println("==========================");

        // 2번 방법 , 변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        System.out.print(animal.kind + " " );
        animal.sound();

        animal = new Cat();
        System.out.print(animal.kind + " " );
        animal.sound();
        System.out.println("==========================");

        // 3번 방법, 메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
        System.out.println("==========================");

    }
    public static void animalSound(Animal animal) {
        System.out.print(animal.kind + " ");
        animal.sound();
    }
}
/* 1,2,3번 방법의 이해
* 1번방법
    - new Dog(), Cat()을 사용해서 각각 새로운 객체를 생성한다. 그리고 객체 안에 있는
      override된 sound()를 사용한다
* 2번방법 : 변수의 자동타입 반환
    - animal이라는 변수는 Animal객체를 사용 할 수 있게 한다. 그리고 animal에 new Dog()를 활용하여
      객체를 생성하는데, Dog객체는 Animal객체의 자식객체이므로 자동 형변환이 이루어 진다.
      그리고 animal을 사용하면 형식상은 Animal이지만 실제 사용하는것은 Dog객체를 따른다. 물론 자식객체 이기 때문에
      부모-자식클래스의 관계를 그대로 적용받는다
* 3번방법 : 메소드의 다형성
    - 다형성은 같은 타입이지만 실행결과과 다양한 객체를 이용 할 수 있게 한다.
      이것은 상속의 개념을 잘 이해하면 부모클래스로 매개변수를 정의하고, 매개변수
      에 자식객체들을 대입해서 다양한 결과를 얻을 수 있게한다
* 2번과3번의 차이점
    - 2번 : Animal클래스를 가지는 animal이라는 변수를 선언하고, 이 변수에 자식클래스들을 생성산다
            이 때 자식클래스들은 자동 타입 변환으로 인해 Animal의 필드를 참조한다
    - 3번 : animalSound(Animal animal)메소드를 통해서 Animal타입의 매개변수를 받는다.
            인자값으로 Animal클래스의 자식클래스를 생성한다. 그리고 메소드를 생성하는데, 이때
            자동 타입 변환으로 인해 같은 같은 타입값이지만 다른 결과값이 나오는 다형성을 지니게된다.
* */