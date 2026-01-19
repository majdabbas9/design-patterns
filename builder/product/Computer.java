package builder.product;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String motherboard;

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }
    public void setMotherboard(String motherboard){
        this.motherboard = motherboard;
    }

    public void displayInfo() {
        System.out.println("Configuration:"
                + "\nMotherboard: " + this.motherboard
                + "\nCPU: " + this.cpu
                + "\nRAM: " + this.ram
                + "\nStorage: " + this.storage + "\n\n");
    }
}
