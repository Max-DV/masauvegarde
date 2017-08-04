package Client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("tentative connexion");
		Socket socket = new Socket("10.31.0.51", 9090);

		System.out.println("bonjour");
		OutputStream os = (OutputStream) socket.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeInt(22);

		oos.writeInt(24);
		oos.flush();

		InputStream osR = socket.getInputStream();
		ObjectInputStream oosR = new ObjectInputStream(osR);
		int c = oosR.readInt();
		System.out.println(c);

		oos.writeObject("t que dla merde");
		Object s = oosR.readObject();
		System.out.println(s);

		socket.close();
		System.out.println("bon ben voila");

	}

}
