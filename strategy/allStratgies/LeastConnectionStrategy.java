package strategy.allStratgies;

import java.util.ArrayList;

import strategy.Server;

public class LeastConnectionStrategy implements LoadBalancerStrategy {

    @Override
    public int strategy(ArrayList<Server> servers, int prevPicked) {
        int min = Integer.MAX_VALUE, idx = -1;
        for (int i = 0; i < servers.size(); i++) {
            if (servers.get(i).getNumberConnection() < min && servers.get(i).isHealthy() && i != prevPicked) {
                min = servers.get(i).getNumberConnection();
                idx = i;
            }
        }
        if (idx == -1) {
            return (prevPicked != -1 && servers.get(prevPicked).isHealthy()) ? prevPicked : -1;
        } else {
            return idx;
        }
    }

}
