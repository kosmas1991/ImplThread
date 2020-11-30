
public class IThread implements Runnable {
private String name;
	/**
 * @param name
 */
public IThread(String name) {
	super();
	this.name = name;
}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am running. Me lene " + name);
	}
	
}
