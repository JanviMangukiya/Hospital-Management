public class Billing {
    private int id;
    private Patient patient;
    private double amount;
    private String date;

    public Billing(int id, Patient patient, double amount, String date) {
        this.id = id;
        this.patient = patient;
        this.amount = amount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Billing [ID: " + id + ", Patient: " + patient.getName() + ", Amount: $" + amount + ", Date: " + date + "]";
    }
}
