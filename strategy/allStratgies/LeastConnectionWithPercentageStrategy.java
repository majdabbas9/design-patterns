package strategy.allStratgies;

import java.util.ArrayList;

import strategy.Server;

public class LeastConnectionWithPercentageStrategy implements LoadBalancerStrategy {

    @Override
    public int strategy(ArrayList<Server> servers, int prevPicked) {
        java.math.BigDecimal min = java.math.BigDecimal.valueOf(2);
        int idx = -1;
        for (int i = 0; i < servers.size(); i++) {
            Server curr_server = servers.get(i);
            java.math.BigDecimal serverUtilzeRation = curr_server.getServerUtilizationRate();
            if (serverUtilzeRation.compareTo(min) < 0 && servers.get(i).isHealthy() && i != prevPicked) {
                min = serverUtilzeRation;
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
