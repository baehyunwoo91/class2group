package step1;
/*
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
import java.util.Scanner;

public class _4 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if(a<0||b>10) {
			throw new Exception("오류");
		}
		System.out.println(b-a);
	}

}
