package singleton;
public class Singleton {
   private static final  Singleton instance = new Singleton();
   private Singleton(){}
   public static synchronized Singleton getinstance(){return Singleton.instance;}
   public static void do_something(){System.out.println("Something is Done.");}
}
