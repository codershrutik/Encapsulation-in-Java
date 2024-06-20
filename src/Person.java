public class Person{

    private String name = "Shruti";
    private int age = 21;
    private String gender = "Female";

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Setters can give some access to other classes
    public void setName(String name){
        this.name = name;
    }

    public boolean setAge(int age){
        if(age<0 || age>100){
            return false;
        } else{
            this.age = age;
            return true;
        }
    }

    public String toString(){
        return "Person{" +
            "name = " + name +
            ", age = " + age +
            ", gender = " + gender +"\'" +
            "}";
    }
}