package Project.HospitalManagement;

public class Patient {
    private static int idCounter=0;
    private int id;
    private String name;
    private String gender;
    private int age;

    public Patient(String name, String gender, int age){
        this.id= ++idCounter;
        this.name = name;
        this.age = age;
        this.gender=gender;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Patient ID : "+id+" , Name : "+name+" , Gender : "+gender+" , Age : "+age;
    }

}
