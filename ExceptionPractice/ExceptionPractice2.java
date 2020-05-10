package ExceptionPractice;

import java.util.Scanner;

/**
 * 2.写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形
 *  如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”
 *  如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数， 调用此方法，并捕获异常。
 * @author Administrator
 *
 */

public class ExceptionPractice2 {
	static void isTriangle(int a,int b,int c) {
		try {
			if(a+b<=c||a+c<=b||b+c<=a) {
				throw new Exception("a,b,c不能构成三角形");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("请输入三角形三边长：");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		isTriangle(a,b,c);
	}

}
