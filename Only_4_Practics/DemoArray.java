import java.util.*;
public class DemoArray{
	public static void main(String[] args){
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("c");
		lst.add("DoubleConsumer");
		lst.add("e");
		lst.add("u");
		System.out.println(lst);
		String[] arr = new String[lst.size()];

		lst.toArray(arr);
		for(String res: arr){
			System.out.print(res+", ");
		}

	}
}