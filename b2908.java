import java.util.*;
public class b2908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a=in.next(),b=in.next();
		int []tmp1 = new int[3];
		int []tmp2 = new int[3];
		int t1,t2;
		for(int i=0;i<3;i++) {
			tmp1[i] = Integer.parseInt(a.substring(i,i+1));
			tmp2[i] = Integer.parseInt(b.substring(i,i+1));
		}
		t1 = tmp1[0]+tmp1[1]*10+tmp1[2]*100;
		t2 = tmp2[0]+tmp2[1]*10+tmp2[2]*100;
		if(t1>t2)System.out.println(t1);
		else if(t1<t2)System.out.println(t2);	
	}
}