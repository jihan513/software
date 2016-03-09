import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {	
		
		DecimalFormat df = new DecimalFormat("###0.00");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入本金：");
		double P = scanner.nextDouble();
		System.out.println("输入利率：");
		double i = scanner.nextDouble();
		System.out.println("输入期限：");
		int N = scanner.nextInt();	
		
		double F = P*Math.pow((1+i),N);
		
		String K = df.format(F);
		System.out.println("复利终值为："+K);
	}

}
