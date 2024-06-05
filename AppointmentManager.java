package petcare;

import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {
    private List<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }

    public void viewAllAppointments() {
        System.out.println("------------------------------------------------------------------");
        System.out.printf("| %-15s | %-12s | %-20s |\n", "Pet Name", "Date", "Vet Name");
        System.out.println("------------------------------------------------------------------");
        for (Appointment appointment : appointments) {
            System.out.printf("| %-15s | %-12s | %-20s |\n", appointment.getPetName(), appointment.getAppointmentDate(), appointment.getVetName());
        }
        System.out.println("------------------------------------------------------------------");
    }
}
