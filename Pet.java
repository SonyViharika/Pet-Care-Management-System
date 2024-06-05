package petcare;

public class Pet {
    private String name;
    private String type;
    private int age;
    private String ownerName;
    private String medicalHistory;

    public Pet(String name, String type, int age, String ownerName, String medicalHistory) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.ownerName = ownerName;
        this.medicalHistory = medicalHistory;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}
