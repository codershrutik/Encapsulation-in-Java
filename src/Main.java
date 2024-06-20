public class Main{
    public static void main(String[] args) {

        //For encapsulation
        // Person person = new Person("John Cena",35,"Male");
        // person.setName("Archana");
        // person.setAge(45);
        // System.out.println(person);

        //Polymorphism
        // Phone phone = new Phone();
        // phone.feature();

        // Nokia3310 nokia = new Nokia3310();
        // nokia.feature();

        // iPhone iphone = new iPhone();
        // iphone.feature();

        //reference to phone object
        Phone phone;
        phone = new Nokia3310();
        phone.feature();
    }
}