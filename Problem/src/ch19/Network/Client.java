package ch19.Network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
    private Socket socket;

    public void connect( String ip, int port ) throws IOException {
        socket = new Socket();
        socket.connect(new InetSocketAddress(ip, port));
    }
    public void send( String str ) throws IOException {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(this.socket.getOutputStream())
        );
        bw.write(str);
        bw.flush();
        bw.close();
    }

    public void close() throws IOException {
        this.socket.close();
    }
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.connect("172.111.116.49", 59999);
            client.send(String.format("Client[%s] %s"
                    , InetAddress.getLocalHost()
                    , "접속 했습니다."));
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
