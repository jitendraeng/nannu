package PracticeJava;

public class Radha {

	public static void main(String[] args) {
		int[] a= {4,5,8,7,2,1,3};
		
		int[] b=new int[a.length];
		
		
		for (int i = a.length-1; i >=0; i--) {
			
		b[i]=a[a.length-1-i];
			
		}
		
		for(int c :b) {
			
			System.out.print(c+" ");
			
		}
	}

}
