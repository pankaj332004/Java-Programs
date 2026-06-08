package practical3;

public class person {
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Name : " + name + " and age : " + age);
    }
}
class main{
    public static void main(String[] args) {
        person p1 = new person("Pankaj",21);
        person p2 = new person("Aman",19);
        p1.display();
        p2.display();
    }
}
