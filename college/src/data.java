public class data {
    public static void main(String[] args) {
        student_info a = new student_info();
        student_info b = new student_info(38);
        student_info c = new student_info(75,"ABC");
        student_info d = new student_info(b);
        a.display_info();
        b.display_info();
        c.display_info();
        d.display_info();
        d.display_info("Welcome");
        d.display_info();

    }
}
