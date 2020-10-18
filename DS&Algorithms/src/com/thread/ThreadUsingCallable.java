package com.thread;

import java.util.concurrent.Callable;

public class ThreadUsingCallable implements Callable<Long>{

	@Override
	public Long call() throws Exception {

		return Thread.currentThread().getId();

	}

}
