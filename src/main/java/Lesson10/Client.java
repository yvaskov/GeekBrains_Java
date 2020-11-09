package Lesson10;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try(Socket socket = new Socket("localhost", 10001);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scn = new Scanner(System.in))
        {
            String message = "";
            while (!message.equals("/exit")) {
                System.out.print("Введите сообщение: ");
                message = scn.nextLine();
                out.writeUTF(message);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
