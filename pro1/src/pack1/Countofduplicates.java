package pack1;

public class Countofduplicates {

	public static void main(String[] args) {
		String s="integernumbersarethere";
		int count;
		char[] str=s.toCharArray();
		System.out.println("duplicates:");
		for(int i=0;i<str.length;i++) {
			count=1;
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j] && str[i]!=str[j]) {
					count++;
					//Str[j]='0';
				}
			}
		
		if(count>1 && str[i]!='0') {
			System.out.println(str[i]);
		}
		}
		

	}

}
