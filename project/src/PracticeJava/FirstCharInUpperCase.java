package PracticeJava;

public class FirstCharInUpperCase {

	public static void main(String[] args) {

		String s = "jai shree ram";
		String a[] = s.split(" "); 

		String r = "";
		for (String d : a) {
			if (!d.isEmpty()) {
				String f = d.substring(0, 1).toUpperCase() + d.substring(1)+" " ;
				r = r + f;
			}

		}
r=r.trim();
		System.out.println(r);

	}
}
