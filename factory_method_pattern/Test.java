package factory_method_pattern;

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
