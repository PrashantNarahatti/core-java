package com.workz.parallel;

public class RunnableScammer {

	public static void main(String[] args) {
		Runnable runnable= ()->{System.out.println("inside lambda");
		};
		
		Thread thread =new Thread(runnable);
		thread.setDaemon(true);
		thread.start();
		
		Thread thread2 =new Thread(runnable);
		thread2.start();
		}

	}


