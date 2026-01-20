package abstract_factory.products.Intel;

import abstract_factory.products.RAM;

public class IntelRAM implements RAM {
    @Override
    public void printSpecs() {
        System.out.println("32GB DDR5 Optimized for Intel XMP");
    }
}
