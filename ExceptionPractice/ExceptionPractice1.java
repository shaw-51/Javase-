package ExceptionPractice;

import java.util.Scanner;

/**
 * 1.编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。
 *   如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
 * @author Administrator
 *
 */
public class ExceptionPractice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("请输入分数：");
		int a=sc.nextInt();
		if(a<0||a>100)
		throw new Exception("请保证输入分数在0-100之间");
		}
		catch(Exception e) {
			e.printStackTrace(); 
		}
		
				

	}

}
