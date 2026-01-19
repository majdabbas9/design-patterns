package builder;

import builder.builderComp.*;
import builder.product.Computer;

public class Test {
   public static void main(String[] args) {
       Builder b = new ComputerBuilder();
       ComputerDirector cd = new ComputerDirector();
       cd.construct(b, "motherBoard", "Cpu", "Ram", "Storage");
       Computer c = b.getInfo();
       c.displayInfo();
   }
}
