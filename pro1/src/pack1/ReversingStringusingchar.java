package pack1;

public class ReversingStringusingchar {

	public static void main(String[] args) {
	String s="parvathi";
	String reverse="";
	char[] ch=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		reverse+=ch[i];
		
	}
	System.out.println(reverse);

	}

}
