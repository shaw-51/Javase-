package ExceptionPractice;

import java.util.Scanner;

/**
 * 2.дһ������void isTriangle(int a,int b,int c)���ж����������Ƿ��ܹ���һ��������
 *  ����������׳��쳣IllegalArgumentException����ʾ�쳣��Ϣ ��a,b,c���ܹ��������Ρ�
 *  ������Թ�������ʾ�����������߳������������еõ���������������������� ���ô˷������������쳣��
 * @author Administrator
 *
 */

public class ExceptionPractice2 {
	static void isTriangle(int a,int b,int c) {
		try {
			if(a+b<=c||a+c<=b||b+c<=a) {
				throw new Exception("a,b,c���ܹ���������");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("���������������߳���");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		isTriangle(a,b,c);
	}

}
