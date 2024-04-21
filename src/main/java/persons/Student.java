package persons;

public class Student extends Person{

    private String joke;

    public Student(){

    }

    public Student(String joke){
        this.joke = joke;
    }
    public Student(String name, int age, String address, String joke){
        super(name,age,address);
        this.joke = joke;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("And my favourite joke is");
        tellJoke();
    }

    public void tellJoke(){
        System.out.println(this.joke);
    }


}
