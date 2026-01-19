package factory_method_pattern.factory;

import factory_method_pattern.vehicle.TwoWheeler;
import factory_method_pattern.vehicle.Vehicle;

public class TwoVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle create(){
        return new TwoWheeler();
    }
}
