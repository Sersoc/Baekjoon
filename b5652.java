import java.util.*;
public class b5652 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] di = new char[15];
		int sum=0;
		for(int i=0;i<s.length();i++) {
			di[i] = s.charAt(i);
			if(di[i]>='A'&&di[i]<='C')sum+=3;
			else if(di[i]>='D'&&di[i]<='F')sum+=4;
			else if(di[i]>='G'&&di[i]<='I')sum+=5;
			else if(di[i]>='J'&&di[i]<='L')sum+=6;
			else if(di[i]>='M'&&di[i]<='O')sum+=7;
			else if(di[i]>='P'&&di[i]<='S')sum+=8;
			else if(di[i]>='T'&&di[i]<='V')sum+=9;
			else if(di[i]>='W'&&di[i]<='Z')sum+=10;
			System.out.println(sum);
		}
		System.out.print(sum);
	}

}
