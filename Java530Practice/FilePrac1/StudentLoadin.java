package FilePrac1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 *  ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
 */
public class StudentLoadin {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һλѧ����");
		String stu1=sc.nextLine();
		double Yscore1=sc.nextFloat();
		double Mscore1=sc.nextFloat();
		double Escore1=sc.nextFloat();
		System.out.println("������ڶ�λѧ����");
		String stu2=sc.next();
		double Yscore2=sc.nextFloat();
		double Mscore2=sc.nextFloat();
		double Escore2=sc.nextFloat();
		System.out.println("���������λѧ����");
		String stu3=sc.next();
		double Yscore3=sc.nextFloat();
		double Mscore3=sc.nextFloat();
		double Escore3=sc.nextFloat();
		System.out.println("���������λѧ����");
		String stu4=sc.next();
		double Yscore4=sc.nextFloat();
		double Mscore4=sc.nextFloat();
		double Escore4=sc.nextFloat();
		System.out.println("���������λѧ����");
		String stu5=sc.next();
		double Yscore5=sc.nextFloat();
		double Mscore5=sc.nextFloat();
		double Escore5=sc.nextFloat();
	
		Student su1=new Student(stu1,Yscore1,Mscore1,Escore1);
		Student su2=new Student(stu2,Yscore2,Mscore2,Escore2);
		Student su3=new Student(stu3,Yscore3,Mscore3,Escore3);
		Student su4=new Student(stu4,Yscore4,Mscore4,Escore4);
		Student su5=new Student(stu5,Yscore5,Mscore5,Escore5);
		
		Double []arr=new Double[] {su1.Score,su2.Score,su3.Score,su4.Score,su5.Score};
		Arrays.sort(arr);
		
		BufferedWriter out = new BufferedWriter(new FileWriter("Student.txt"));   

		String str="\r\n";  //д���ļ����з�
		  int i=arr.length-1;
			while(i>=0) {
				if(arr[i]==su1.Score) {
					out.write(su1.toString());
					out.write(str);
				}
				else if (arr[i]==su2.Score) {
					out.write(su2.toString());
					out.write(str);
				}
				else if (arr[i]==su3.Score) {
					out.write(su3.toString());
					out.write(str);
				}
				else if (arr[i]==su4.Score) {
					out.write(su4.toString());
					out.write(str);
				}
				else if (arr[i]==su5.Score) {
					out.write(su5.toString());
					out.write(str);
				}
				out.flush();
				i--;
			}
			
			 out.close(); // ���ǵùر��ļ� 

	}

}
