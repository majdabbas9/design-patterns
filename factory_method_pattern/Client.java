package factory_method_pattern;

import factory_method_pattern.factory.VehicleFactory;
import factory_method_pattern.vehicle.Vehicle;

public class Client {
   private final  Vehicle privateVehicle;
   public Client(VehicleFactory vf){
    this.privateVehicle = vf.create();
   }
   public Vehicle getVehicle(){
    return this.privateVehicle;
   }
}
