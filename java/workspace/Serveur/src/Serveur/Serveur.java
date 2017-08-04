package Serveur;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class Serveur {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("Avant ouverture du port");
		ServerSocket socketserver = new ServerSocket(9090);
		System.out.println("En quoi puis-je vous aider?");
		Socket communicationAvecClient = socketserver.accept();

		InputStream is = communicationAvecClient.getInputStream();
//		ObjectInputStream ois = new ObjectInputStream(is);

		
		while (true)
		  {
		  int data = is.read();
		 if(data== -1)
		  break;
		  System.out.print((char) (data & 0xff));
		 
		  }
		
//		int a = ois.readInt();
//		System.out.println(a);
//
//		int b = ois.readInt();
//		System.out.println(b);
//
//		int c = a * b;
//
//		OutputStream osR = communicationAvecClient.getOutputStream();
//		ObjectOutputStream oosR = new ObjectOutputStream(osR);
//		oosR.writeInt(c);
//		oosR.flush();
//
//
//		Object s=ois.readObject();
//		System.out.println(s);
//		oosR.writeObject(" ＼（〇_ｏ）／ ");
	
		
		System.out.println("la communication va etre fermée");
		communicationAvecClient.close();
		System.out.println("aa");

	}
}