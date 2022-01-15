package Part7.Ex784;

public class Cat extends Animal{
    Cat(){
        this.kind = kind;
    }

    @Override
    public void sound() {
        System.out.println("냥냥!");
    }
}
