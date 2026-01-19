package factory_method_pattern.factory;

import factory_method_pattern.vehicle.OcataWheeler;
import factory_method_pattern.vehicle.Vehicle;

public class OcataWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle create(){
        return new OcataWheeler();
    }
}
