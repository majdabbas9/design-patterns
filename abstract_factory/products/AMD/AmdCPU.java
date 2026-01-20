package abstract_factory.products.AMD;

import abstract_factory.products.CPU;

public class AmdCPU implements CPU {
    @Override
    public void getSeries() {
        System.out.println("AMD Ryzen 9 7950X");
    }
}
