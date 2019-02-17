
public interface InterfaceDemo{

	public void hello();

	default void m1(){
		System.out.println("Hello by Interface");

	}

	private void m2(){
		System.out.println("Hello by Private");
	}
}