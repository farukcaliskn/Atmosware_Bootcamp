package SocketDataSave;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		String receiveMessage;// mesaj almak
		String sendMessage; // mesa j göndersin

		try {
			try (Socket socket = new Socket("localhost", 8585)) {
				// Client veri gönderecek
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
				OutputStream outputStream = socket.getOutputStream();
				PrintWriter printWriter = new PrintWriter(outputStream, true);

				// serverdan gelen veriyi almak
				InputStream inputStream = socket.getInputStream();
				BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
				System.out.println("Client: Lütfen mesaj yazýnýz ");

				while (true) {
					// clientten veri almak
					sendMessage = bufferedReader.readLine();
					printWriter.println(sendMessage);
					try (BufferedWriter bufferedWriter = new BufferedWriter(
							new FileWriter("/home/farukcaliskan/Desktop/crud.txt", true))) {
						bufferedWriter.write("Client: " + sendMessage);
						bufferedWriter.newLine();
						bufferedWriter.flush();

						// System.exit(0);
					} catch (Exception e) {
						e.printStackTrace();
					}
					printWriter.flush();

					if ((receiveMessage = bufferedReader2.readLine()) != null) {
						System.out.println("SERVER: " + receiveMessage);

					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
