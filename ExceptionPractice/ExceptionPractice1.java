package ExceptionPractice;

import java.util.Scanner;

/**
 * 1.��д��������û����������Ϣ�����������0��100֮�䣬����ɼ���
 *   ����ɼ����ڸ÷�Χ�ڣ��׳��쳣��Ϣ����ʾ����������0��100֮�䡣
 * @author Administrator
 *
 */
public class ExceptionPractice1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
		System.out.println("�����������");
		int a=sc.nextInt();
		if(a<0||a>100)
		throw new Exception("�뱣֤���������0-100֮��");
		}
		catch(Exception e) {
			e.printStackTrace(); 
		}
		
				

	}

}
