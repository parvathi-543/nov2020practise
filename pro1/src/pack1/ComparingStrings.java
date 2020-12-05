package pack1;

import java.util.Arrays;

public class ComparingStrings {

	public static void main(String[] args) {
		String a="cat";
		String b="Act";
if(a.length()==b.length()) {
	char[] ch1=a.toLowerCase().toCharArray();
	char[] ch2=b.toLowerCase().toCharArray();	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	//System.out.println(ch1);
	//System.out.println(ch2);
	boolean result=Arrays.equals(ch1, ch2);
	if(result) {
		System.out.println("match");
	}
	else {
		System.out.println("not matched");
	}
	
}}}

