import java.util.Scanner;
public class b1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tmp,count = 0, n = sc.nextInt();
		int[] min = new int [(int)Math.log10(n)];
		boolean ch = true;
		for(int i=1;i<=n;i++) {
			tmp = i;
			if(i<100)count++;
			else if(i>=100) {
					for(int j=0;j<(int)Math.log10(i);j++) {
						min[j] = tmp%10-tmp/10%10;
						tmp/=10;
							}
					for(int k=0;k<(int)Math.log10(i)-1;k++) {
						if(min[k]==min[k+1])ch=true;
						else if(min[k]!=min[k+1]) {
							ch=false;
							break;
						}
					}
					if(ch)count++;
			}
			
		}
		System.out.print(count);
	}

}