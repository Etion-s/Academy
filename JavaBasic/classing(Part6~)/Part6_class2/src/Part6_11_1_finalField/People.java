package Part6_11_1_finalField;

public class People {
    final String nation = "Korea";
    final String ssn;
    String name;

    public People(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}
