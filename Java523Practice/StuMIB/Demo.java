package StuMIB;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
//����ѵ��3
//�����������ݴ洢����,�洢ѧ���ʹ洢��������
//ѧ����Ҫ��¼����ϵͳ���ܽ��п���,
//ÿ���һ���ʮ��,������û�з�
public class Demo {
	public static void main(String []args) {
	Student stu1=new Student("��ٻ",01,"123456");
	Student stu2=new Student("�ŷ�",02,"123457");
	Student stu3=new Student("�Ų���",03,"123458");
	Student stu4=new Student("�Ź���",04,"1234569");
	Map<String,Student> map1=new HashMap<>();
	map1.put("123456",stu1);
	map1.put("123457",stu2);
	map1.put("123458",stu3);
	map1.put("123459",stu4);
	
	
	Test tst1=new Test(1,"��һ.....",'A');
	Test tst2=new Test(2,"���....",'D');
	Test tst3=new Test(3,"����....",'C');
	Test tst4=new Test(4,"����.....",'A');
	Test tst5=new Test(5,"����...",'B');
	Test tst6=new Test(6,"����...",'C');
	Test tst7=new Test(7,"����....",'D');
	Test tst8=new Test(8,"���....",'B');
	Test tst9=new Test(9,"���...",'C');
	Test tst10=new Test(10,"��ʮ...",'A');
	
	Map<Integer,Test> map2=new HashMap<>();
	map2.put(1,tst1);
	map2.put(2,tst2);
	map2.put(3,tst3);
	map2.put(4,tst4);
	map2.put(5,tst5);
	map2.put(6,tst6);
	map2.put(7,tst7);
	map2.put(8,tst8);
	map2.put(9,tst9);
	map2.put(10,tst10);
	
	System.out.println("������ѧ��������");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println("������ѧ�����룺");
	String str2=sc.nextLine();
	Student stu5=new Student(str,01,str2);
	
	if(stu5.equals(stu1)||stu5.equals(stu2)||stu5.equals(stu3)||stu5.equals(stu4)) {
		System.out.println("�����֤�ɹ�!  ��ʼ���ԣ�");
		
	}
	
    for(Integer ch:map2.keySet()) {
    	Test tsts=map2.get(ch);
    	System.out.println(tsts.getDes());
    	System.out.println("\n");
    }
    
    System.out.println("��������Ĵ𰸣�");
    String answer=sc.nextLine();
    char[]ch = answer.toCharArray();

    int i=0;
    int j=0;
    for(Integer ch2:map2.keySet()) {
    	if(ch[i++]!=map2.get(ch2).getRop()) {
    		j++;
    	}
    }
    
   for(int k=j;k>0;k--)
   {
    	stu5.DisCalculator();
    	j--;
    }
    System.out.println("ѧ����"+stu5.getName()+"�ܵ÷�Ϊ:"+stu5.getGrade());

    
    	
    }
    
	


}
