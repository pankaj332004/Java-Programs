package OOPSdecode;
// parent / base class
class Person{
    public String name;
    public String address;
    public int age;
}
// child / derived class
class Student1 extends Person{
    public int marks;
    public String grade;

    // constructor
    Student1(String name, String address , int age , int marks , String grade){
        this.name = name;
        this.address=address;
        this.age=age;
        this.marks = marks;
        this.grade = grade;
    }

    public void disp(){
        System.out.println("Name is    :: "+name);
        System.out.println("Address is :: "+address);
        System.out.println("Age is     :: "+age);
        System.out.println("Marks  is  :: "+marks);
        System.out.println("Grade is   :: "+grade);
    }
}
public class InheritanceTestApp {
    public static void main(String[] args) {
        // creation of the object for the student class
        Student1 st = new OOPSdecode.Student1("Pankaj","Chipiyana",22,95,"A+");
        st.disp();
    }
}
