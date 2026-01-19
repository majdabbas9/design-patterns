package builder.builderComp;
import builder.product.Computer;

public interface  Builder {
    public void buildMotherBoard(String Motherbaord);
    public void buildCpu(String Cpu);
    public void buildRam(String Ram);
    public void buildStorage(String Storage);
    public Computer getInfo();
}
