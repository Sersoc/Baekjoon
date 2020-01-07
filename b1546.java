import java.util.Scanner;
public class b1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double max = 0,sum = 0;
		int i,n;
		n = sc.nextInt();
		double [] a = new double[n];
		
		for(i=0;i<n;i++) {
			a[i] = sc.nextDouble();
			if(max<a[i])
				max=a[i];
		}
		for(i=0;i<n;i++) {
			a[i] = a[i]/max*100;
			sum += a[i];
		}
		System.out.print(sum/n);

	}
	
}