import java.util.Scanner;
public class b10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S;
		S = sc.next();
		for(char c='a';c<='z';c++) {
			for(int j=0;j<S.length();j++) {
				if(S.charAt(j)==c) {
					System.out.print(j+" ");
					break;
				}
				else if(j==S.length()-1&&S.charAt(j)!=c)
					System.out.print(-1+" ");
			}
			
		}
	}

}
