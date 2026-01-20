package abstract_factory.factory;

import abstract_factory.products.Intel.*;
import abstract_factory.products.CPU;
import abstract_factory.products.GPU;
import abstract_factory.products.RAM;

public class IntelFactory implements HardwareFactory {

    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public GPU createGPU() {
        return new IntelGPU();
    }

    @Override
    public RAM createRAM() {
        return new IntelRAM();
    }
}
