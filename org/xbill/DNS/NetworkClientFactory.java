package org.xbill.DNS;

public class NetworkClientFactory {

    public static NetworkClient getDefault() {
        return new NetworkClientImpl();
    }
}
