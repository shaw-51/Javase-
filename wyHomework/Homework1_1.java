package wyHomework;

import java.util.Scanner;

/**
 *   �� byte [] by={65,67,68,97,98,101}  ת�����ַ������
     �������ֽ�����  ��ָ����λ�ÿ�ʼ������ת�����ַ������*/

public class Homework1_1 {
	public static void main(String []args) {
		byte [] by={65,67,68,97,98,101};
		String res = new String(by);
	     System.out.println(res);
	     System.out.printf("�����������λ�ã�");
	     Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(res.substring(i-1,res.length()));
	}
	
	
}
