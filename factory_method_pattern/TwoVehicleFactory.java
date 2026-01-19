package factory_method_pattern; 
public class TwoVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle create(){
        return new TwoWheeler();
    }
}
