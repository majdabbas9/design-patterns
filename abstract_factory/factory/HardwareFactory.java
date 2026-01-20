package abstract_factory.factory;

import abstract_factory.products.CPU;
import abstract_factory.products.GPU;
import abstract_factory.products.RAM;

public interface HardwareFactory {
    CPU createCPU();

    GPU createGPU();

    RAM createRAM();
}