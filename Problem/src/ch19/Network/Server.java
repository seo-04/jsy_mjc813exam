package ch19.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;

    public Socket accept(int port) throws IOException {
        this.serverSocket = new ServerSocket();
        this.serverSocket.bind(new InetSocketAddress(port));
        Socket socket = this.serverSocket.accept();
        return socket;
    }

    public void read(Socket socket) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );
        String str = br.readLine();
        System.out.printf("클라이언트 : %s\n", str);
        br.close();
        socket.close();
    }

    public void close() throws IOException {
        this.serverSocket.close();
    }
    public static void main(String[] args) {
        Server client = new Server();
        try {
            Socket sck = client.accept(59999);
            client.read(sck);
            client.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
