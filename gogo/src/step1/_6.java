package step1;
/*
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
import java.util.Scanner;

public class _6 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		double b = s.nextDouble();
		if(a<0&&b>10) {
			throw new Exception("오류");
		}
		System.out.println(a/b);
	}

}
