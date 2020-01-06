import java.util.Scanner;
public class 10818{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,min,max;
		n=sc.nextInt();
		int [] a = new int[n];
		
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		min=a[0];
		max=a[0];
		for(i=1;i<n;i++) {
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
		System.out.println(min+" "+max);
	}
}