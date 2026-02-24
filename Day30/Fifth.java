package com.app;

public class Fifth{
	public static void main(String args[]){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				for(int i=1;i<=10;i++){
					System.out.println("i : "+i+" current thread name: "+Thread.currentThread().getName());
				}
			}
		});
		t1.setName("first thread");
		t1.start();

		// lambda expression
		Runnable task = ()->{
			for(int i=1;i<=10;i++){
				System.out.println("i : "+i+" current thread name: "+Thread.currentThread().getName());
			}
		};
		Thread t2 = new Thread(task);
		t2.setName("second thread");
		t2.start();
	}
}