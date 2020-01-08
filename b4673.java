
public class b4673 {
	public static void main(String[] args) {
		int[] n = new int[10001];
		int[] a = new int [30000];
		
		for(int i=0;i<10001;i++) {
			n[i] = i;
			if(i<10) {
				a[i+i]=i+i;
			}
			else if(i<100) {
				a[i+i%10+i/10%10]=i+i%10+i/10%10;
			}
			else if(i<1000) {
				a[i+i%10+i/10%10+i/100%10]=i+i%10+i/10%10+i/100%10;
			}
			else if(i<10000) {
				a[i+i%10+i/10%10+i/100%10+i/1000%10]=i+i%10+i/10%10+i/100%10+i/1000%10;
			}
			
		}
		for(int i=0;i<10001;i++) {
			if(a[i]!=n[i])System.out.println(i);
		}
	}

}
