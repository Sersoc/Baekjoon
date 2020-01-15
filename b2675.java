import java.util.Scanner;
public class b2675 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		String s = sc.next();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
