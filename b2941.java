import java.util.*;
public class b2941 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] cro = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String s = in.next();
		
		for(int i=0;i<8;i++) {
			s=s.replace(cro[i], "a");
		}
		System.out.print(s.length());
		
		
	}

}
