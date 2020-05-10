package wyHomework;

import java.util.Scanner;

/**
 *  10."我是你的谁,我是你的剑"  从指定位置开始截取长度;
 *  从指定位置开始截取到指定位置结束长度的字符串
 * @author Administrator
 *
 */
public class Homework1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我是你的谁,我是你的剑";
		System.out.println("请输入指定位置i:"+"(0<i"+"<"+str.length()+")");
		Scanner in =new Scanner(System.in);
		int a=in.nextInt();
		String b=str.substring(a-1,str.length());//从下标a开始到末尾的长度字符输出
		System.out.println(b);
		
		System.out.println("请输入指定开始位置j:"+"(0<i"+"<"+str.length()+")");
		int d=in.nextInt();
		System.out.println("请输入指定长度:"+"(0<i"+"<"+str.length()+")");
		int e=in.nextInt();
		String c=str.substring(d-1,d+e-2);
		System.out.println(c);
		
		

	}

}
