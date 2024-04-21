package persons;

public class PersonTest {
    public static void main(String[] args) {
        //Initialisierung der Person
        Person person = new Person();
        person.setName("Roberto");
        person.setAge(26);
        person.setAddress("Long Street 2500");

        //Person introduce()
        System.out.println("Person Introduce: ");
        person.introduce();
        System.out.println();

        //Initialisierung des Studenten
        Student student = new Student("Roberto",25,"Long Street 1000", "Treffen sich zwei Jäger");

        //Student tellJoke()
        System.out.println("Student tellJoke()");
        student.tellJoke();
        System.out.println();

        //Student introduce()
        System.out.println("Student introduce(): ");
        student.introduce();
    }
}
