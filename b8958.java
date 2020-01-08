import java.util.Scanner;
public class b8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,s=1,n;
		n = sc.nextInt();
		int [] ms = new int[n];
		String [] an = new String[n];

		for(i=0;i<n;i++) {
			an[i] = sc.next();
			for(j=0;j<an[i].length();j++) {
				if(an[i].charAt(j)=='O') {
					ms[i] += s;
					s++;
				}
				else if(an[i].charAt(j)=='X') {
					s=1;
				}
			}
			s=1;
		}
		for(i=0;i<n;i++)System.out.println(ms[i]);
		
		
	}

}