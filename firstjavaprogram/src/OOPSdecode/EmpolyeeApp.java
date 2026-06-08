package OOPSdecode;
class Employee{
    // Data-security
    private String e_id;
    private String e_name;
    private int e_age;
    private String e_address;

    // setter method :: public
    // void return type
    public void setE_id(String e_id){
        this.e_id=e_id;
    }

    public void setE_name(String e_name){
        this.e_name=e_name;
    }

    public void setE_age(int e_age){
        this.e_age=e_age;
    }

    public void setE_address(String e_address){
        this.e_address=e_address;
    }

    // getter method :: public
    // return type will be the property return type
    public String getE_id(){
        return e_id;
    }

    public String getE_name(){
        return e_name;
    }

    public int getE_age(){
        return e_age;
    }

    public String getE_address(){
        return e_address;
    }
}
public class EmpolyeeApp {
    public static void main(String[] args) {
        // object creation for the Employee class
        Employee e1 = new Employee();

        // calling the setter method of the employee
        e1.setE_id("101");
        e1.setE_name("Pankaj Kumar Rajbhar");
        e1.setE_age(23);
        e1.setE_address("Chipiyana Buzurg");

        // calling the getter method of the employee class
        System.out.println("Employee Id : "+e1.getE_id());
        System.out.println("Employee Name : "+e1.getE_name());
        System.out.println("Employee Age : "+e1.getE_age());
        System.out.println("Employee Address : "+e1.getE_address());

    }
}
