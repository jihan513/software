import java.util.Scanner;

public class Money {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入计算方式：1.单利计算 2.复利计算 3.本金计算 4.股票期限计算 5.利率计算 6.资产总值计算"); // 选择计算方式
		int choose = scanner.nextInt();

		if (choose == 1) { // 1.单利计算模式
			danLiJiSuan(scanner);
		} else if (choose == 2) { // 2.复利计算模式
			fuLiJiSuan(scanner);
		} else if (choose == 3) { // 3.本金计算模式
			benJinJiSuan(scanner);
		} else if (choose == 4) { // 4.股票计算模式
			guPiaoQiXian(scanner);
		} else if (choose == 5) { // 5.利率计算模式
			liLvJiSuan(scanner);
		} else if (choose == 6) {
			ziChanZongZhi(scanner);
		}

		scanner.close();

	}

	//资产总值计算模式
	private static void ziChanZongZhi(Scanner scanner) {
		double P;
		double i;
		double N;
		double F;
		System.out.println("请输入本金：");
		P = scanner.nextDouble();
		System.out.println("请输入每年的投资金额：");
		double T = scanner.nextDouble();
		System.out.println("请输入投资年限：");
		N = scanner.nextInt();
		System.out.println("请输入利率：");
		i = scanner.nextDouble();
		//计算
		for (int j = 0; j < N; j++) {
			P = P * (1 + i);
			P = P + T;
		}
		F = P - T;
		System.out.println("资产总值是：" + F);
	}

	//利率计算模式
	private static void liLvJiSuan(Scanner scanner) {
		double P;
		double i;
		double N;
		double F;
		System.out.println("输入本金：");
		P = scanner.nextDouble();
		System.out.println("输入期限：");
		N = scanner.nextDouble();
		System.out.println("输入本息总值：");
		F = scanner.nextDouble();
		// 计算
		i = F / (P * N);
		System.out.println("利率为：" + i);
	}

	//股票期限计算模式
	private static void guPiaoQiXian(Scanner scanner) {
		double P;
		double i;
		double N;
		double F;
		System.out.println("输入本金：");
		P = scanner.nextDouble();
		System.out.println("输入利率：");
		i = scanner.nextDouble();
		System.out.println("输入本息总值：");
		// 计算
		F = scanner.nextDouble();
		N = (F - P) / (i * P);
		System.out.println("期限为：" + N);
	}

	//本金计算模式
	private static void benJinJiSuan(Scanner scanner) {
		double P;
		double i;
		double N;
		double F;
		System.out.println("输入本息总值：");
		F = scanner.nextDouble();
		System.out.println("输入利率：");
		i = scanner.nextDouble();
		System.out.println("输入期限：");
		N = scanner.nextDouble();
		P = F / (1 + i * N);
		System.out.println("应投入本金：" + P);
	}

	//复利计算模式
	private static void fuLiJiSuan(Scanner scanner) {
		double P;
		double i;
		double N;
		double F;
		System.out.println("输入本金：");
		P = scanner.nextDouble();
		System.out.println("输入利率：");
		i = scanner.nextDouble();
		System.out.println("输入期限：");
		N = scanner.nextDouble();
		F = P * Math.pow((1 + i), N);
		System.out.println("本息总值为：" + Math.round(F * 100) / 100.0);
	}

	//单利计算模式
	private static void danLiJiSuan(Scanner scanner) {
		double P;
		double i;
		double N;
		double F;
		System.out.println("输入本金：");
		P = scanner.nextDouble();
		System.out.println("输入利率：");
		i = scanner.nextDouble();
		System.out.println("输入期限：");
		N = scanner.nextDouble();
		F = P + P * i * N;
		System.out.println("本息总值为：" + Math.round(F * 100) / 100.0);
	}

}