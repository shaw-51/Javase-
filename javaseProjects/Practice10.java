package javaseProjects;
//����
import java.util.Scanner;

//ѭ������10����(50����),ͳ��ÿ�������ֵĴ���

//1.����һ���ַ������飬�״γ�����װ�ں���
//2.��֮ǰ��Ԫ�رȽϣ���ͬ�����ڶ�Ӧ�±�����������һ
public class Practice10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String []arr=new String[10];
		int []art= new int [10];
		for(int i=0;i<10;i++){
			Scanner sc=new Scanner(System.in);
			String st=null;
			st=sc.next();
			art[i]=0;
			int k=0;//��־����ȡ�������Ƿ��ظ�
			for(int j=0;j<i;j++){
		   if(arr[j]==st){
			   art[j]++;
			    k=1;
		   }
			}
			if(k==0)
			arr[i]=st;
		}
		int j=0;int i=0;
		while((j<10)&&(arr[i]!="\0")){
			System.out.println("arr["+j+"]"+":"+arr[i]+"���ִ�����"+art[i]);
			j++;
			i++;
		}
	}

}
