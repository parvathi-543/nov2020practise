package pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
	List<String>obj=new ArrayList<String>();
	obj.add("app");
	obj.add("bat");
	obj.add("app");
	obj.add("bat");
	Set onb=new HashSet(obj);
	System.out.println(onb);
	
	}

}
