package factory_method_pattern.factory;

import factory_method_pattern.vehicle.FourWheeler;
import factory_method_pattern.vehicle.Vehicle;

public class FourVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle create(){
        return new FourWheeler();
    }
}
