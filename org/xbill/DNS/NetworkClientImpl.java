package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;

public class NetworkClientImpl implements NetworkClient {

    public byte[] sendrecvTCP(SocketAddress local, SocketAddress remote, byte[] data, long endTime) throws IOException {
        return TCPClientImpl.sendrecv(local, remote, data, endTime);
    }

    public byte[] sendrecvUDP(SocketAddress local, SocketAddress remote, byte[] data, int max, long endTime) throws IOException {
        return UDPClient.sendrecv(local, remote, data, max, endTime);
    }
}
