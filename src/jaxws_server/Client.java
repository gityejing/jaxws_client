package jaxws_server;

import java.rmi.RemoteException;

public class Client {
	public static void main(String[] args) {
		Method1ServiceProxy client = new Method1ServiceProxy();
		try {
			int count = client.getCount3("22");
			System.out.println(count);
			count = client.getCountX(20);
			System.out.println(count);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
}
