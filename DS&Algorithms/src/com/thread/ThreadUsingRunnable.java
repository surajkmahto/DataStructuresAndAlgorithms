package com.thread;

public class ThreadUsingRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread Id: " + Thread.currentThread().getId());
	}
}
