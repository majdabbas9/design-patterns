package abstract_factory.factory;

import abstract_factory.products.CPU;
import abstract_factory.products.GPU;
import abstract_factory.products.RAM;
import abstract_factory.products.AMD.*;

public class AmdFactory implements HardwareFactory {

    @Override
    public CPU createCPU() {
        return new AmdCPU();
    }

    @Override
    public GPU createGPU() {
        return new AmdGPU();
    }

    @Override
    public RAM createRAM() {
        return new AmdRAM();
    }
}
