package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;

public interface NetworkClient {

    byte[] sendrecvTCP(SocketAddress local, SocketAddress remote, byte [] data, long endTime) throws IOException;

    byte[] sendrecvUDP(SocketAddress local, SocketAddress remote, byte [] data, int max, long endTime) throws IOException;
}
