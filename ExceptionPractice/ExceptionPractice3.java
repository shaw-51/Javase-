package ExceptionPractice;

import java.util.Scanner;

/**
 * 3.��дһ������N������ƽ��ֵ�ĳ��򡣳���Ӧ����ʾ�û�����N��ֵ����α�����������N������
 *   ����û������ֵ��һ����������Ӧ���׳�һ���쳣��������ʾ��N��������������0����
 *   ����ʾ�û��ٴ��������
 * @author Administrator
 *
 */
public class ExceptionPractice3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("��������������ĸ���N��");
			int a=sc.nextInt();
			if(a<0) {
				throw new Exception("N����Ϊ��������0");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("����������");
		}		
	}

}
