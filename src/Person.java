public class Person{

    public String name = "Shruti";
    public int age = 21;
    public String gender = "Female";

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString(){
        return "Person{" +
            "name = " + name +
            ", age = " + age +
            ", gender = " + gender +"\'" +
            "}";
    }
}