package javaseProjects;

import java.util.Scanner;

//手动输入任意三个数，求三个数的和，差
public class Practice12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []num=new int[3];
		for(int i=0;i<3;i++){
		Scanner sc=new  Scanner(System.in);
		System.out.println("请输人第"+(i+1)+"个数");
		  num[i]=sc.nextInt();
		}
		int sum=num[0]+num[1]+num[2];
		int cha=num[0]-num[1]-num[2];
		System.out.println("三个数字之和是："+sum+" 三个数的差是："+cha);

	}

}
