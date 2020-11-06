package Lesson10;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(10001)) {
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> newClientThread(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void newClientThread(Socket socket) {
        try (DataInputStream inp = new DataInputStream(socket.getInputStream())) {
            String message = "";
            while (!message.equals("/exit")) {
                message = inp.readUTF();
                System.out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
