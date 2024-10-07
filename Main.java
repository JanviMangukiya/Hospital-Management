import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HospitalManagementSystem hms = new HospitalManagementSystem();
        
        System.out.println("Welcome to the Hospital Management System");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Manage Patients");
            System.out.println("2. Manage Doctors");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. Billing");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hms.managePatients();
                    break;
                case 2:
                    hms.manageDoctors();
                    break;
                case 3:
                    hms.scheduleAppointment();
                    break;
                case 4:
                    hms.processBilling();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}
