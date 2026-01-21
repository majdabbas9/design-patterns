package strategy;

import strategy.allStratgies.LoadBalancerStrategy;
import java.util.ArrayList;

public class LoadBalancer {
    private final IPAddress ip;
    private ArrayList<Server> servers = new ArrayList<>();
    private int prevPicked;
    private LoadBalancerStrategy current_Strategy;

    public LoadBalancer(IPAddress ip) {
        this.ip = ip;
        this.prevPicked = -1;
    }

    public void addServer(Server server) {
        this.servers.add(server);
    }

    public void pickNextServer() {
        int pickedServer = current_Strategy.strategy(this.servers, this.prevPicked);
        switch (pickedServer) {
            case -1:
                System.out.println("all the servers are busy");
                break;
            default:
                servers.get(pickedServer).add_connection();
                System.out.println("sent request to " + servers.get(pickedServer));
                this.prevPicked = pickedServer;
                break;
        }
    }

    public void changeStrategy(LoadBalancerStrategy strategy) {
        this.current_Strategy = strategy;
    }
}
