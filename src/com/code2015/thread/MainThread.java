package com.code2015.thread;

public class MainThread extends Thread 
{ 
	public void run(){
		/*for (int i = 0; i < 5; i++) {
            System.out.println("运行  :  " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}*/
		while(true){
			System.out.println("运行  :  ");
		}
	}
	
	public static void main(String[] args) {
		MainThread mt=new MainThread();
		mt.start();
	}

} 
