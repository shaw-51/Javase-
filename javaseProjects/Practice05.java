package javaseProjects;

import java.util.Scanner;

/***
 * int x = 5, y = 6, z;
   A.z = ++x + y++;
  B.z = ++x + x++;
   C.z = ++x + x++；
  D.z = x > y ? ++x : y++; 
输出ABCD题目中x、y、z的值
 * @author user
 *
 */
public class Practice05 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int x = 5, y = 6, z;
		while(true){
			System.out.println("请选择A，B,C,D中的一种：");
			 Scanner sc=new Scanner(System.in);
			String s=sc.next();
		switch(s){
		case "A":{
			case1(x,y);
			break;
		}
		case "B":{
			case2(x,y);
			break;
		}
		case "C":{
			case3(x,y);
			break;
		}
		case "D":{
			case4(x,y);
			break;
		}
		default:
			System.out.println("选择出错，注意大写！");
		}
		System.out.println("是否继续？【Y/N】");
		Scanner sc2=new Scanner(System.in);
		String s2=sc2.next();
		if(s2.equals("N"))//不能使用==！！
			break;		
		}

	}
	public static void case1(int x,int y){
		int z;
		z = ++x + y++;
		System.out.println("X: "+x+","+"Y: "+y+","+"Z: "+z);
	}
	public static void case2(int x,int y){
		int z;
		z = ++x + x++;
		System.out.println("X: "+x+","+"Y: "+y+","+"Z: "+z);
	}
	public static void case3(int x,int y){
		int z;
		z = ++x + x++;
		System.out.println("X: "+x+","+"Y: "+y+","+"Z: "+z);
	}
	public static void case4(int x,int y){
		int z;
		z = x > y ? ++x : y++;
		System.out.println("X: "+x+","+"Y: "+y+","+"Z: "+z);
	}
}
