import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
    private String name;
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    public Hospital(String name) {
        this.name = name;
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
        addSampleData(); // Adding some sample doctors and patients
    }

    private void addSampleData() {
        doctors.add(new Doctor(1, "Dr. Smith", "Cardiologist"));
        doctors.add(new Doctor(2, "Dr. Williams", "Neurologist"));
        patients.add(new Patient(1, "John Doe", 25));
        patients.add(new Patient(2, "Jane Roe", 30));
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== " + name + " Management System ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Appointments");
            System.out.println("5. Billing");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: addPatient(); break;
                case 2: addDoctor(); break;
                case 3: scheduleAppointment(); break;
                case 4: viewAppointments(); break;
                case 5: generateBill(); break;
                case 6: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }

    private void addPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        int id = patients.size() + 1;
        patients.add(new Patient(id, name, age));
        System.out.println("Patient added successfully.");
    }

    private void addDoctor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Doctor Specialty: ");
        String specialty = scanner.nextLine();
        int id = doctors.size() + 1;
        doctors.add(new Doctor(id, name, specialty));
        System.out.println("Doctor added successfully.");
    }

    private void scheduleAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
        System.out.print("Enter Doctor ID: ");
        int doctorId = scanner.nextInt();
        Doctor doctor = findDoctorById(doctorId);
        if (doctor == null) {
            System.out.println("Invalid Doctor ID.");
            return;
        }

        System.out.println("Available Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();
        Patient patient = findPatientById(patientId);
        if (patient == null) {
            System.out.println("Invalid Patient ID.");
            return;
        }

        System.out.print("Enter Appointment Date (dd-mm-yyyy): ");
        String date = scanner.next();
        appointments.add(new Appointment(doctor, patient, date));
        System.out.println("Appointment scheduled successfully.");
    }

    private Doctor findDoctorById(int id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == id) return doctor;
        }
        return null;
    }

    private Patient findPatientById(int id) {
        for (Patient patient : patients) {
            if (patient.getId() == id) return patient;
        }
        return null;
    }

    private void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("Scheduled Appointments:");
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    private void generateBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Appointment ID for Billing: ");
        int appointmentId = scanner.nextInt();
        if (appointmentId < 1 || appointmentId > appointments.size()) {
            System.out.println("Invalid Appointment ID.");
            return;
        }

        Appointment appointment = appointments.get(appointmentId - 1);
        double consultationFee = 500.0;
        System.out.println("Billing Details:");
        System.out.println("Patient: " + appointment.getPatient().getName());
        System.out.println("Doctor: " + appointment.getDoctor().getName());
        System.out.println("Consultation Fee: $" + consultationFee);
        System.out.println("Total Amount: $" + consultationFee);
    }
}
