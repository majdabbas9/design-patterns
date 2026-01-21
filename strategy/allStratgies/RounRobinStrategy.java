package strategy.allStratgies;

import strategy.Server;
import java.util.ArrayList;

public class RounRobinStrategy implements LoadBalancerStrategy {

    @Override
    public int strategy(ArrayList<Server> servers, int prevPicked) {
        int stop = prevPicked;
        int curr_server_index = prevPicked;
        do {
            curr_server_index = (curr_server_index + 1) % (servers.size());
            if (servers.get(curr_server_index).isHealthy()) {
                return curr_server_index;
            }
        } while (curr_server_index != stop);
        return servers.get(stop).isHealthy() ? stop : -1;
    }
}
