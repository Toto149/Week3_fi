package persons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private String address;

    public Person(){

    }
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void introduce(){
        System.out.printf("Hello my Name is %s, I'm %d years old and live in '%s'%n",this.name,this.age,this.address);
    }
}
