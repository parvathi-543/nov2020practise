package pack1;


public class ReversingStringusingbyte {

	public static void main(String[] args) {
		String a="automation testing";
		byte[] ab=a.getBytes();
		byte[] result=new byte[ab.length];
		
		for(int i=0;i<ab.length;i++) {
			result[i]=ab[ab.length-i-1];
			

		}
		System.out.println(new String(result));

	}

}
