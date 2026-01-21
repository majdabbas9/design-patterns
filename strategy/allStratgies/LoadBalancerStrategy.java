package strategy.allStratgies;

import strategy.Server;
import java.util.ArrayList;

public interface LoadBalancerStrategy {
    public int strategy(ArrayList<Server> servers, int prevPicked);
}