package strategy;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public final class IPAddress {

    public enum Version {
        IPV4, IPV6
    }

    private final String value;
    private final Version version;

    public IPAddress(String value) {
        try {
            InetAddress address = InetAddress.getByName(value);

            if (address instanceof Inet4Address) {
                this.version = Version.IPV4;
            } else if (address instanceof Inet6Address) {
                this.version = Version.IPV6;
            } else {
                throw new IllegalArgumentException("Unknown IP format");
            }

            this.value = value;

        } catch (UnknownHostException e) {
            throw new IllegalArgumentException("Invalid IP address: " + value);
        }
    }

    public String getValue() {
        return value;
    }

    public Version getVersion() {
        return version;
    }

    public boolean isIPv4() {
        return version == Version.IPV4;
    }

    public boolean isIPv6() {
        return version == Version.IPV6;
    }
}
