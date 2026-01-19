package factory_method_pattern;

import factory_method_pattern.factory.FourVehicleFactory;
import factory_method_pattern.factory.OcataWheelerFactory;
import factory_method_pattern.factory.TwoVehicleFactory;

public class Test {
   public static void main(String[] args) {
       Client c1 = new Client(new TwoVehicleFactory());
       Client c2 = new Client(new FourVehicleFactory());
       Client c3 = new Client(new OcataWheelerFactory());
       c1.getVehicle().printVehicle();
       c2.getVehicle().printVehicle();
       c3.getVehicle().printVehicle();
   } 
}
