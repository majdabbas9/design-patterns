package abstract_factory.products.Intel;

import abstract_factory.products.GPU;;

public class IntelGPU implements GPU {
    @Override
    public void getArchitecture() {
        System.out.println("Intel Arc (Alchemist)");
    }
}
