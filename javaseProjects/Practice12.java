package javaseProjects;

import java.util.Scanner;

//�ֶ��������������������������ĺͣ���
public class Practice12 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int []num=new int[3];
		for(int i=0;i<3;i++){
		Scanner sc=new  Scanner(System.in);
		System.out.println("�����˵�"+(i+1)+"����");
		  num[i]=sc.nextInt();
		}
		int sum=num[0]+num[1]+num[2];
		int cha=num[0]-num[1]-num[2];
		System.out.println("��������֮���ǣ�"+sum+" �������Ĳ��ǣ�"+cha);

	}

}
