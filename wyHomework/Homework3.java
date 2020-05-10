package wyHomework;

import java.util.Scanner;

/**
 * 作业3: 求任意两个数之间的随机数
 * @author Administrator
 *
 */
public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("输入两个数字(先小后大)：");
		Scanner sc=new Scanner(System.in);
		int Min=sc.nextInt();
		int Max=sc.nextInt();
		
		int a=Min + (int)(Math.random() * ((Max - Min) + 1));
				System.out.println(a);

	}

}
