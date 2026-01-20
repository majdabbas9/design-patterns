package abstract_factory;

import abstract_factory.factory.*;

public class Test {
    public static void main(String[] args) {
        HardwareFactory h1 = new AmdFactory();
        HardwareFactory h2 = new IntelFactory();
        computerAssembler c1 = new computerAssembler(h1);
        computerAssembler c2 = new computerAssembler(h2);
        c1.showSystemConfig();
        c2.showSystemConfig();
    }

}
