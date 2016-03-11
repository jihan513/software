import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {//242726

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double P=0,i=0;
		int N=0;
		double F = 0;
		
		System.out.println("请输入计算方式：1.单利计算 2.复利计算 3.计算本金"); //选择计算方式
		int choose = scanner.nextInt();
		
		if(choose==1||choose==2){ //前两种方式的输入格式
			System.out.println("输入本金：");
			P = scanner.nextDouble();
			System.out.println("输入利率：");
			i = scanner.nextDouble();
			System.out.println("输入期限：");
			N = scanner.nextInt();
		}else if(choose==3){ //第三种方式的输入格式
			System.out.println("输入本息总值：");
			F = scanner.nextDouble();
			System.out.println("输入利率：");
			i = scanner.nextDouble();
			System.out.println("输入期限：");
			N = scanner.nextInt();
		}

		if(choose==1){ //单利计算方式
			F=P+P*i*N;
			System.out.println("本息总值为：" + Math.round(F*100)/100.0);
		}else if(choose==2){ //复利计算方式
			F=P*Math.pow((1 + i), N);
			System.out.println("本息总值为：" + Math.round(F*100)/100.0);
		}else if(choose==3){ //本金计算方法
			P = F/(1+i*N);
			System.out.println("应投入本金："+P);
		}

	}

}
