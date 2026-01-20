package abstract_factory.products.Intel;

import abstract_factory.products.CPU;

public class IntelCPU implements CPU {
    @Override
    public void getSeries() {
        System.out.println("Intel Core i9-14900K");
    }
}
