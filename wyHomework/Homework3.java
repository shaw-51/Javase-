package wyHomework;

import java.util.Scanner;

/**
 * ��ҵ3: ������������֮��������
 * @author Administrator
 *
 */
public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("������������(��С���)��");
		Scanner sc=new Scanner(System.in);
		int Min=sc.nextInt();
		int Max=sc.nextInt();
		
		int a=Min + (int)(Math.random() * ((Max - Min) + 1));
				System.out.println(a);

	}

}
