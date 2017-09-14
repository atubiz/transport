
package transport;

import java.util.Locale;

/**
 *
 * @author thuannv
 */
public final class Address {
    
    private final int mPort;
    
    private final String mHost;
    
    public Address(String host, int port) {
        mHost = host;
        mPort = port;
    }
    
    public String getHost() {
        return mHost;
    }
    
    public int getPort() {
        return mPort;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "%s:%d", mHost, mPort);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Address) {
            Address other = (Address) obj;
            if (mHost != null) {
                return mPort == other.getPort() && mHost.equals(other.getHost());
            }
            if (other.getHost() == null) {
                return mPort == other.getPort();
            }
        } 
        return false;
    }
    
    
}