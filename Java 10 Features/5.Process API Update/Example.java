

public class Example{

	public static void main(String[] args) throws InterruptedException{
		
		long pid = ProcessHandle.current().pid();
		System.out.println(pid);
		Thread.sleep(10000);
	}
}