package pack1;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value");
		int nvalue=s.nextInt();
		System.out.println("Enter m value");
		int mvalue=s.nextInt();
		int n=nvalue;//n number of var
		int m=mvalue;//rows
		int range=41;
		Random rm=new Random();
		for(int i=1;i<=n;i++) {
			//for(int j=i+1;j<=m;j++) {
		int randomnum=rm.nextInt(range);
		//System.out.println(randomnum);
		int[] arr= {randomnum};
		int sum=0;
		for(int e:arr) {
		sum+=(0*10)+sum;
		
		
		}
		System.out.println(sum);
	}
		}
}
