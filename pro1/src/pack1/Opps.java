package pack1;


public class Opps  {
	/*
	 * public void name(double d,double e) { System.out.println("first"); }
	 */
	public void name(double d,double e) {
		System.out.println("second");	
	}
	private void name(int d,int e) {
		System.out.println("third");	
	}
	public static void main(String[] args) {
	Opps a=new Opps();
	//a.name(1.5, 8.9);
	a.name(1, 5);
	a.name(0.5, 0.9);

		

	}

}
