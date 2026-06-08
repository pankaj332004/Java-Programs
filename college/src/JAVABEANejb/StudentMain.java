package JAVABEANejb;

public class StudentMain {
    public static void main(String[] args) {
        StudentBean student =  new StudentBean();

        student.setName("Pankaj Kumar Rajbhar");
        student.setRollNo(170);

        String[] courses = {"WT","DAA","DBMS"};

        student.setCourse(courses);

        System.out.println(student.getName());
        System.out.println(student.getRollNo());

        String[] retCourses = student.getCourse();
        for(int i=0;i<retCourses.length;i++){
            System.out.println(retCourses[i]);
        }

        student.setCourse(2,"OOSD");

        retCourses = student.getCourse();
        for(int i=0;i< retCourses.length;i++){
            System.out.println(retCourses[i]);
        }

        System.out.println(student.getCourse(1));
    }
}
