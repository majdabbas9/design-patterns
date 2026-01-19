package factory_method_pattern;

public class OcataWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle create(){
        return new OcataWheeler();
    }
}
