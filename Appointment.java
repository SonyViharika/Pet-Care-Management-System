package petcare;

public class Appointment {
    private String petName;
    private String appointmentDate;
    private String vetName;

    public Appointment(String petName, String appointmentDate, String vetName) {
        this.petName = petName;
        this.appointmentDate = appointmentDate;
        this.vetName = vetName;
    }

    public String getPetName() {
        return petName;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getVetName() {
        return vetName;
    }
}
