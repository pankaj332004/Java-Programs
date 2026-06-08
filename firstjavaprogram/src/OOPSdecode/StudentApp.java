package OOPSdecode;

class Student{
    // Data - Security
    private int rollNo;
    private String name;
    private String address;

    // setter method :: public
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    // getter method :: public
    // data type should be the property data type of the method
    public int getRollNo(){
        return rollNo;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

}
public class StudentApp {
    public static void main(String[] args) {
        // object creation for the student class
        Student s1 = new Student();

        // calling the setter method
        s1.setRollNo(170);
        s1.setName("Pankaj Kumar Rajbhar");
        s1.setAddress("Chipiyana Buzurg");

        // calling the getter method
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
    }
}
