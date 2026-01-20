package abstract_factory.products.AMD;

import abstract_factory.products.RAM;

public class AmdRAM implements RAM {
    @Override
    public void printSpecs() {
        System.out.println("32GB DDR5 Optimized for AMD EXPO");
    }
}
