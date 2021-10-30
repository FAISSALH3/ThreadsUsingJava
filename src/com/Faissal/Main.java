package com.Faissal;

import javax.print.attribute.standard.RequestingUserName;

class Multi implements Runnable {


    public void run() {
        System.out.println("Thread is running ...");

    }

}
public class Main {
    public static void main(String[] args) {
	Multi m1 = new Multi();
	Thread t1 = new Thread(m1);
	t1.start();
	System.out.println(t1.getPriority());
	System.out.println(t1.getId());
	//m1.start();
    }


}
