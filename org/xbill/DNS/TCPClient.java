package org.xbill.DNS;

import java.io.IOException;
import java.net.SocketAddress;

public interface TCPClient {

    void bind(SocketAddress addr) throws IOException;

    void connect(SocketAddress addr) throws IOException;

    void send(byte [] data) throws IOException;

    byte [] recv() throws IOException;

    void cleanup() throws IOException;
}
