package com.xworkz.core.method.overiding;

public class SockStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sock sock= new Sock();
		Sock sock2 = new Sock();
		
		System.out.println(sock.toString());
		System.out.println(sock.hashCode());

		sock.setName("Jockey");
		sock2.setName("Bamboo");
		System.out.println(sock.equals(sock2));

	}

}
