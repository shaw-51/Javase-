package javaseProjects;

import java.util.Scanner;

/***
 * int x = 5, y = 6, z;
   A.z = ++x + y++;
  B.z = ++x + x++;
   C.z = ++x + x++��
  D.z = x > y ? ++x : y++; 
���ABCD��Ŀ��x��y��z��ֵ
 * @author user
 *
 */
public class Practice05 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int x = 5, y = 6, z;
		while(true){
			System.out.println("��ѡ��A��B,C,D�е�һ�֣�");
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
			System.out.println("ѡ�����ע���д��");
		}
		System.out.println("�Ƿ��������Y/N��");
		Scanner sc2=new Scanner(System.in);
		String s2=sc2.next();
		if(s2.equals("N"))//����ʹ��==����
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
