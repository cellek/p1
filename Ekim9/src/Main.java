import java.util.Scanner;


public class Main {
	
	public int hi() {
		System.out.println("Hi World");
	}
	
	public static int countEven(int[] osman) {
		int count = 0;
		for (int i=0; i<osman.length; i++) {
			if (osman[i]%2 == 0)
				count++;
		}
		return count;
	}
	
	public int fonksiyon1(int q) {
		return q*2;
	}
	
	public double fonksiyon2(double q1 , double q2) {
		return q1*q2;
	}
	
	public static void main(String[] args) {

		int a;
		
		System.out.println("Chapter7");
		
		int[] data;
		data = new int[25];
		
		int[] data2 = { 13, 34,  2, 34,   100,  299 } ;
	
		// b.sayilaritanimla(data2);
		
		sayilar b = new sayilar(data2);
		
		sayilar ali = new sayilar();
		
		//ali.sayilariklavyedenal();
		
		
		for  (int i=0; i<25; i++) {
			System.out.print(data[i]+" ");
		}

		System.out.println(" ");
		
		for (int i=0; i<data2.length; i++) {
			System.out.print("\n"+data2[i]);
		}

		System.out.println("\n ");	

		System.out.println(countEven(data2));
		
		System.out.println(b.ciftolanlarsayisi());
		
		System.out.println(b.a);
		System.out.println(ali.a);
		System.out.println("\n ");	
		
		System.out.println(ali.ciftolanlarsayisi(2));
		
		System.out.println(ali.elemanlar[2]);
		
		
		
	}
	
}
