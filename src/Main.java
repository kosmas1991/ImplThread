
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IThread ithread1=new IThread("thread1");
		Thread thread1=new Thread(ithread1);
		thread1.start();
	}

}
