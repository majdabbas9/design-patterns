package abstract_factory.products.AMD;

import abstract_factory.products.GPU;

public class AmdGPU implements GPU {
    @Override
    public void getArchitecture() {
        System.out.println("AMD RDNA 3");
    }
}
