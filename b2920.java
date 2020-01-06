import java.util.Scanner;
public class b2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n,dis=0;
		int[] a = new int[8];
		
		for(i=0;i<8;i++) 
			a[i]=sc.nextInt();
		for(i=0;i<7;i++) {
			if(a[i]>a[i+1])
				dis+= 1;
			else if(a[i]<a[i+1])
				dis-=1;
		}
		if(dis==7) 
			System.out.println("ascending");
		else if(dis==-7)
			System.out.println("descending");
		else
			System.out.println("mixed");
	}

}
