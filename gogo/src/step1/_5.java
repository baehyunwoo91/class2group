package step1;
/*
 * ù° �ٿ� A�� B�� �־�����. (0 < A, B < 10)
 */
import java.util.Scanner;

public class _5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a<0&&b>10) {
			throw new Exception("����");
		}
		System.out.println(a*b);
	}

}
