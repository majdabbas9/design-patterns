package strategy;

import strategy.allStratgies.*;

public class Test {
    public static void main(String[] args) throws Exception {
        LoadBalancerStrategy strategy = new RounRobinStrategy();
        LoadBalancerStrategy strategy2 = new LeastConnectionWithPercentageStrategy();
        LoadBalancer lb = new LoadBalancer(new IPAddress("192.168.1.1"));

        // Use reflection to access the private Server constructor
        java.lang.reflect.Constructor<Server> serverConstructor = Server.class.getDeclaredConstructor(IPAddress.class,
                int.class, int.class);
        serverConstructor.setAccessible(true);

        Server s1 = serverConstructor.newInstance(new IPAddress("192.168.1.10"), 25, 1);
        Server s2 = serverConstructor.newInstance(new IPAddress("192.168.1.11"), 32, 1);
        Server s3 = serverConstructor.newInstance(new IPAddress("192.168.1.12"), 1000, 1);

        lb.addServer(s1);
        lb.addServer(s2);
        lb.addServer(s3);

        lb.changeStrategy(strategy2);

        for (int i = 0; i < 30; i++) {
            lb.pickNextServer();
        }
    }
}
