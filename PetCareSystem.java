package petcare;

import java.util.Scanner;

public class PetCareSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetManager petManager = new PetManager();
        AppointmentManager appointmentManager = new AppointmentManager();

        while (true) {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("|                        Pet Care Management System                        |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. Add a new pet");
            System.out.println("2. View all pets");
            System.out.println("3. Schedule a veterinary appointment");
            System.out.println("4. View all scheduled appointments");
            System.out.println("5. Exit");
            System.out.println("----------------------------------------------------------------------------");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    addNewPet(scanner, petManager);
                    break;
                case 2:
                    petManager.viewAllPets();
                    break;
                case 3:
                    scheduleAppointment(scanner, appointmentManager);
                    break;
                case 4:
                    appointmentManager.viewAllAppointments();
                    break;
                case 5:
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNewPet(Scanner scanner, PetManager petManager) {
        System.out.print("Enter pet name: ");
        String name = scanner.nextLine();
        System.out.print("Enter pet type: ");
        String type = scanner.nextLine();
        System.out.print("Enter pet age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Enter medical history: ");
        String medicalHistory = scanner.nextLine();
        petManager.addPet(new Pet(name, type, age, ownerName, medicalHistory));
    }

    private static void scheduleAppointment(Scanner scanner, AppointmentManager appointmentManager) {
        System.out.print("Enter pet name: ");
        String petName = scanner.nextLine();
        System.out.print("Enter appointment date: ");
        String appointmentDate = scanner.nextLine();
        System.out.print("Enter vet name: ");
        String vetName = scanner.nextLine();
        appointmentManager.scheduleAppointment(new Appointment(petName, appointmentDate, vetName));
    }
}
