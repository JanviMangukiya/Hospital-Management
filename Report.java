public class Report {
    private int id;
    private Patient patient;
    private String reportDetails;

    public Report(int id, Patient patient, String reportDetails) {
        this.id = id;
        this.patient = patient;
        this.reportDetails = reportDetails;
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getReportDetails() {
        return reportDetails;
    }

    @Override
    public String toString() {
        return "Report [ID: " + id + ", Patient: " + patient.getName() + ", Details: " + reportDetails + "]";
    }
}
