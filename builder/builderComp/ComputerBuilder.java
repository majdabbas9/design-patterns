package builder.builderComp;

import builder.product.Computer;

public class ComputerBuilder implements Builder{
    private Computer Pc = new Computer();
    @Override
    public void buildMotherBoard(String motherboard){
        this.Pc.setMotherboard(motherboard);
    }
    @Override
    public void buildCpu(String Cpu){
        this.Pc.setCPU(Cpu);
    }    
    @Override
    public void buildRam(String Ram){
        this.Pc.setCPU(Ram);
    }
    @Override
    public void buildStorage(String Storage){
        this.Pc.setStorage(Storage);
    }
    @Override
    public Computer getInfo(){
        return this.Pc;
    }
}
