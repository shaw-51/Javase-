package ExceptionPractice;

import java.util.Scanner;

/**
 * 3.编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，如何必须输入所有N个数。
 *   如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正数或者0”。
 *   并提示用户再次输入该数
 * @author Administrator
 *
 */
public class ExceptionPractice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("请输入求解整数的个数N：");
			int a=sc.nextInt();
			if(a<0) {
				throw new Exception("N必须为整数或者0");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("请重新输入");
		}		
	}

}
