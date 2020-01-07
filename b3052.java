import java.util.Scanner;
public class b3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,n = 0,j;
		int [] a = new int[10];
		int [] di = new int[10];
		for(i=0;i<10;i++) {
			a[i] = sc.nextInt();
			di[i] = a[i]%42;
		}
		for(i=0;i<42;i++) {
			for(j=0;j<10;j++) {
				if(i==di[j]) {
					n++;
					break;
				}
			}
		}
		System.out.print(n);
	}

}
