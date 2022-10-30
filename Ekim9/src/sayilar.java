
import java.util.Scanner;

public class sayilar {
	
	 int [] elemanlar;
	 int a;
	
	
	
	public sayilar(int[] disaridangelensayi) {
		this.a=5;
		this.elemanlar=disaridangelensayi;	
	}
	
	public sayilar() {
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		
		elemanlar = new int[10];

        for (int i=0; i<10; i++)
        {
            System.out.println((i+1) +". sayiyi gir: ");
            elemanlar[i]=scan.nextInt();
		
        }
		
	}
	
	public sayilar(int DIZI_BOYUTU) {
		//doldurun
	}
	
	public int ciftolanlarsayisi() {
		int count = 0;
		for (int i=0; i<this.elemanlar.length; i++) {
			if (this.elemanlar[i]%2 == 0)
				count++;
		}
		return count;
		
	}
	
	public int ciftolanlarsayisi(int secim) {
		int count = 0;
		
		if (secim==1) {
			for (int i=0; i<this.elemanlar.length; i++) {
				if (this.elemanlar[i]%2 == 0)
					count++;
			}
		}
		else {
			for (int i=1; i<this.elemanlar.length; i++) {
				if (this.elemanlar[i]%2 == 0)
					count++;
			}
		}
		return count;
		}
		
		
		
}
