package factory_method_pattern;

public class Client {
   private final  Vehicle privateVehicle;
   public Client(VehicleFactory vf){
    this.privateVehicle = vf.create();
   }
   public Vehicle getVehicle(){
    return this.privateVehicle;
   }
}
