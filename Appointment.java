import java.util.Date;

public class Appointment {
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private Date appointmentDate;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, Date appointmentDate) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDate = appointmentDate;
    }

    // Getter and Setter methods
    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "Appointment ID: " + appointmentId + "\nPatient: " + patient.getName() + "\nDoctor: " + doctor.getName() + "\nDate: " + appointmentDate;
    }
}
