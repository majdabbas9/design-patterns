package builder;
import builder.builderComp.*;
public class ComputerDirector{
   public void construct(Builder builder,String motherBoard,String Cpu,String Ram,String Storage){
    builder.buildCpu(Cpu);
    builder.buildMotherBoard(motherBoard);
    builder.buildRam(Ram);
    builder.buildStorage(Storage);
   }
}
