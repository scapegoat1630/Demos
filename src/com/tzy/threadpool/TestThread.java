package com.tzy.threadpool;

public class TestThread {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				System.out.println("the runnable run");
			}
		}) {
			public void run() {
				System.out.println("the thread run");
			}
		}.start();
	}

}
