package petcare;

import java.util.ArrayList;
import java.util.List;

public class PetManager {
    private List<Pet> pets;

    public PetManager() {
        pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println("Pet added successfully.");
    }

    public void viewAllPets() {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("| %-15s | %-10s | %-4s | %-20s | %-30s |\n", "Name", "Type", "Age", "Owner", "Medical History");
        System.out.println("-------------------------------------------------------------");
        for (Pet pet : pets) {
            System.out.printf("| %-15s | %-10s | %-4d | %-20s | %-30s |\n", pet.getName(), pet.getType(), pet.getAge(), pet.getOwnerName(), pet.getMedicalHistory());
        }
        System.out.println("-------------------------------------------------------------");
    }
}
