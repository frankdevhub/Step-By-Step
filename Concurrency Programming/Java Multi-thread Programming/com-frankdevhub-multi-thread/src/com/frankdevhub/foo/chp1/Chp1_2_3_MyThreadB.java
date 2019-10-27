package com.frankdevhub.foo.chp1;

/**
 * @ClassName: MyThread3
 * @author: frankdevhub@gmail.com
 * @date: 2019��10��23�� ����7:09:03
 * @description: System.out.println()���̰߳�ȫ
 * @Copyright: 2019 www.frankdevhub.site Inc. All rights reserved.
 */
public class Chp1_2_3_MyThreadB extends Thread {

	private int i = 5;

	@Override
	public void run() {
		System.out.println("i=" + i-- + Thread.currentThread().getName());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Chp1_2_3_MyThreadB run = new Chp1_2_3_MyThreadB();
		Thread t1 = new Thread(run);
		Thread t2 = new Thread(run);
		Thread t3 = new Thread(run);
		Thread t4 = new Thread(run);
		Thread t5 = new Thread(run);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}
}