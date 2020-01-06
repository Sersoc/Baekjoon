import java.util.Scanner;
public class b2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n=1,max=0;
		int[] a = new int[9];
		
		for(i=0;i<9;++i) {
			a[i]=sc.nextInt();
			if(max<a[i]) {
				max=a[i];
				n=1+i;
			}
		}
		
		System.out.println(max);

		System.out.println(n);
	}

}
