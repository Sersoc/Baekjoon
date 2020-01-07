import java.util.Scanner;
public class b2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,n,i,q,j;
		int [] re = new int[10];
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		n=a*b*c;
		int length = (int)(Math.log10(n)+1);
		for(i=1;i<=length;i++) {
			q=n%(int)Math.pow(10, i)/(int)Math.pow(10, i-1);
			for(j=0;j<=9;j++) {
				if(q==j)
					re[j]+=1;
			}
			
		}
		for(i=0;i<10;i++) {
			System.out.println(re[i]);
		}
	}

}
