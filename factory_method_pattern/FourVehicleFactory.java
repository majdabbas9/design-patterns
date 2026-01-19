package factory_method_pattern;

public class FourVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle create(){
        return new FourWheeler();
    }
}
