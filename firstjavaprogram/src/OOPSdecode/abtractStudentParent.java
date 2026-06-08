package OOPSdecode;

abstract class Person1{
    String name;
    int age;
    float height;

    Person1(String name, int age , float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
}

class student extends Person1{
    int marks;
    float avg;

    student(String name, int age , float height, int marks , float avg){
        // To call parameterised constructor of parent from the child class
        super(name,age,height);
        this.marks = marks;
        this.avg = avg;
    }

    public void display(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
        System.out.println("Height is : "+height);
        System.out.println("Marks is : "+marks);
        System.out.println("Average is : "+avg);
    }
}
public class abtractStudentParent {
    public static void main(String[] args) {
        student s = new student("Pankaj Kumar Rajbhar",22,5.6f,95,85);
        s.display();
    }
}
