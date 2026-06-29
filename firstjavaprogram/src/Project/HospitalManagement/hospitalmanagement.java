package Project.HospitalManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class hospitalmanagement {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    scheduleAppointment(scanner);
                    break;
                case 4:
                    viewPatient();
                    break;
                case 5:
                    viewDoctor();
                    break;
                case 6:
                    viewAppointment();
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Invalid choice Please Enter a valid choice");
            }
        }while (choice != 0);
    }
    private static void addPatient(Scanner scanner){
        System.out.println("Enter Patient Name : ");
        String name = scanner.nextLine();

        System.out.println("Enter Patient Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Patient Gender : ");
        String gender = scanner.nextLine();

        Patient patient= new Patient(name , gender , age);
        patients.add(patient);
        System.out.println("Patient added successfully");
    }
    private static void addDoctor(Scanner scanner){
        System.out.println("Enter Doctor Name : ");
        String name = scanner.nextLine();
        System.out.println("Enter Doctor Speciality");
        String speciality = scanner.nextLine();

        Doctor doctor = new Doctor(name,speciality);
        doctors.add(doctor);
        System.out.println("Doctor Added Successfully");
    }
    private static void scheduleAppointment(Scanner scanner) {
        if(patients.isEmpty() && doctors.isEmpty()){
            System.out.println("Please add patients and doctors first.");
            return;
        }
        if (patients.isEmpty() ) {
            System.out.println("Please add patients  first.");
            return;
        }
        if(doctors.isEmpty()){
            System.out.println("Please add  doctors first.");
            return;
        }


        System.out.println("Select Patient:");

        for (int i = 0; i < patients.size(); i++) {
            System.out.println((i + 1) + ". " + patients.get(i).getId() + doctors.get(i).getName());
        }

        int patientChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Select Doctor:");

        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". " + doctors.get(i).getId() + doctors.get(i).getName());
        }

        int doctorChoice = scanner.nextInt();
        scanner.nextLine();

        if (patientChoice < 1 || patientChoice > patients.size()) {
            System.out.println("Invalid patient selection.");
            return;
        }

        if (doctorChoice < 1 || doctorChoice > doctors.size()) {
            System.out.println("Invalid doctor selection.");
            return;
        }

        System.out.print("Enter Appointment Date (dd-mm-yyyy): ");
        String date = scanner.nextLine();

        Appointment appointment = new Appointment(
                patients.get(patientChoice - 1),
                doctors.get(doctorChoice - 1),date
        );

        appointments.add(appointment);

        System.out.println("Appointment Scheduled Successfully.");
    }
    private static void viewPatient() {
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    private static void viewDoctor() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    private static void viewAppointment() {
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }
}
