package wyHomework;

import java.util.Scanner;

/**
 *  10."�������˭,������Ľ�"  ��ָ��λ�ÿ�ʼ��ȡ����;
 *  ��ָ��λ�ÿ�ʼ��ȡ��ָ��λ�ý������ȵ��ַ���
 * @author Administrator
 *
 */
public class Homework1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="�������˭,������Ľ�";
		System.out.println("������ָ��λ��i:"+"(0<i"+"<"+str.length()+")");
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		String b=str.substring(a-1,str.length());//���±�a��ʼ��ĩβ�ĳ����ַ����
		System.out.println(b);
		
		System.out.println("������ָ����ʼλ��j:"+"(0<i"+"<"+str.length()+")");
		int d=in.nextInt();
		System.out.println("������ָ������:"+"(0<i"+"<"+str.length()+")");
		int e=in.nextInt();
		String c=str.substring(d-1,d+e-2);
		System.out.println(c);
		
		

	}

}
