import javax.net.ssl.ExtendedSSLSession;

class test{
	void calc(int n){

		System.out.println(n*(int)(Math.random()*1000));
		try{
			Thread.sleep(19090);
		}
		catch(Exception e){System.out.println(e);}
	}
}

class Thread1 extends Thread{
	test t;

	public Thread1(test t) {
		super();
		this.t = t;
	}
	
	public void run(){
		t.calc(100);
	}
}

class Thread2 extends Thread{
	test t;

	public Thread2(test t) {
		super();
		this.t = t;
	}
	
	public void run(){
		t.calc(100);
	}
}

public class TestSynchronization1{
	public static void main(String[] args) {
		test t = new test();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		
		t1.start();
		t2.start();
	}
}

