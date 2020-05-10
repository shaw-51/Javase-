package wyHomework;

import java.util.Scanner;

/**
 *   将 byte [] by={65,67,68,97,98,101}  转换成字符串输出
     将上诉字节数组  从指定的位置开始到结束转换成字符串输出*/

public class Homework1_1 {
	public static void main(String []args) {
		byte [] by={65,67,68,97,98,101};
		String res = new String(by);
	     System.out.println(res);
	     System.out.printf("请输入输出首位置：");
	     Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(res.substring(i-1,res.length()));
	}
	
	
}
