package Multithreading;

public  class ThreadCreationByExtendingTheThreadClass{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread t = new myThread();
		t.start();
		
		for (int i=8; i>8; i++) {
			System.out.println("This is main thread");
		}
	}
	}

class myThread extends Thread{
	
	public void run() {
		
		for(int i=0;i<10;i++)
		System.out.println("This is child thread");
}

}

