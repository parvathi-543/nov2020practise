package pack1;

public class Duplicatecharsinstring {

	public static void main(String[] args) {
		String a="my name is parvathi devi to do my work";
		int count=0;
		char[] ab=a.toLowerCase().toCharArray();
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				if(ab[i]==ab[j]) {
					
				System.out.println(ab[j]);
				count++;
				break;
				}
			}
			
		}
		

	}

}
