package OOPSdecode;

class Student2{

    // instance variable
    String name;
    int age;

    // constructor
    Student2(String name, int age){
        this.name = name;
        this.age = age;
    }

    // instance method
    public void disp(){
        System.out.println("Name is  :: "+name);
        System.out.println("Age is   :: "+age);
    }
}

//memory in the stack area
// 
public class instanceVariable {
    public static void main(String[] args) {
        Student2 std1 = new Student2("Pankaj",22);
        std1.disp();

        Student2 std2 = new Student2("Agrim",22);
        std2.disp();
    }
}
