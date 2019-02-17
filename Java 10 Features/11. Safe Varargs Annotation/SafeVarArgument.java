import java.util.*;

public class SafeVarArgument{


	@SafeVarargs
	public static void method(List<String>...l){
		System.out.println(l.toString());
	}
	
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		method(l);
	}
}