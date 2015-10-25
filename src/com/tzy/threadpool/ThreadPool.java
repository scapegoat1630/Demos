package com.tzy.threadpool;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10, 10, 1000, TimeUnit.HOURS, new PriorityBlockingQueue()
		, new DiscardPolicy());
	}

}
