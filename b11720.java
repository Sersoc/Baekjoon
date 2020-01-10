import java.util.Scanner;
public class b11720 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int a1 = scan1.nextInt();
        String a2 = scan1.next();
       
        scan1.close();
        String array[] = new String [a1];
        for(int i=0;i<a1;i++) {
        	array[i] = a2.substring(i,i+1);
        }

        int sum = 0;

        for(int i=0; i<a1; i++) {
                sum += Integer.parseInt(array[i]);
        }
        System.out.println(sum);
       }
}