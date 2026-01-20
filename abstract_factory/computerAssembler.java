package abstract_factory;

import abstract_factory.factory.HardwareFactory;
import abstract_factory.products.*;

public class computerAssembler {
    private CPU cpu;
    private GPU gpu;
    private RAM ram;

    public computerAssembler(HardwareFactory hf) {
        this.cpu = hf.createCPU();
        this.gpu = hf.createGPU();
        this.ram = hf.createRAM();
    }

    public void showSystemConfig() {
        System.out.println("System Configuration:");
        System.out.println("CPU: ");
        this.cpu.getSeries();
        System.out.println("GPU: ");
        this.gpu.getArchitecture();
        System.out.println("RAM: ");
        this.ram.printSpecs();
    }
}
