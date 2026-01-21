package strategy;

public class Server {
    private final IPAddress ip;
    private int current_connection = 0;
    private final int maxConnections;
    private boolean healthy = true;
    private int weight;

    private Server(IPAddress ip, int maxConnections, int weight) throws Exception {
        if (maxConnections <= 0) {
            throw new Exception("cant have a server with 0 max connection");
        }
        this.ip = ip;
        this.maxConnections = maxConnections;
        this.weight = weight;
    }

    public boolean add_connection() {
        if (this.current_connection == this.maxConnections) {
            return false;
        } else {
            this.current_connection += 1;
            if (this.current_connection == this.maxConnections) {
                this.healthy = false;
                this.weight = 0;
            }
            return true;
        }
    }

    public boolean isHealthy() {
        return this.healthy;
    }

    public String getIpAdress() {
        return this.ip.getValue();
    }

    public int getNumberConnection() {
        return this.current_connection;
    }

    public java.math.BigDecimal getServerUtilizationRate() {
        return new java.math.BigDecimal(this.current_connection).divide(new java.math.BigDecimal(this.maxConnections),
                java.math.MathContext.DECIMAL128);
    }

    @Override
    public String toString() {
        return this.getIpAdress();
    }
}
