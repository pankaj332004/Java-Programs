public class student_info {
    int age;
    String name;
    void display_info(){
        System.out.println(name+" has age = "+age);
    }

    void display_info(String t){
        System.out.println("display info for "+t);
    }

    student_info(){
        age = 16;
    }
    student_info(int i){
        name = "xyz";
        age = i;
    }
    student_info(int i, String n){
        name = n;
        age = i;
    }
    student_info(student_info b){
        age = b.age;
        name = b.name;
    }
}
