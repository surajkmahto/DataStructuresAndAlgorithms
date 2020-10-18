package com.thread;

public class Main {

	public static void main(String[] args) throws Exception {
		ThreadUsingCallable thread = new ThreadUsingCallable();
		long id = thread.call();
		System.out.println("Thread Id: " + id);

		ThreadUsingRunnable thread2 = new ThreadUsingRunnable();
		thread2.run();

	}

}
