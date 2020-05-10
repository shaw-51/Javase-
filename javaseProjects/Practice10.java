package javaseProjects;
//故障
import java.util.Scanner;

//循环输入10个数(50以内),统计每个数出现的次数

//1.定义一个字符串数组，首次出现则装在后面
//2.与之前的元素比较，相同，则在对应下标的整形数组加一
public class Practice10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String []arr=new String[10];
		int []art= new int [10];
		for(int i=0;i<10;i++){
			Scanner sc=new Scanner(System.in);
			String st=null;
			st=sc.next();
			art[i]=0;
			int k=0;//标志着所取得数字是否重复
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
			System.out.println("arr["+j+"]"+":"+arr[i]+"出现次数："+art[i]);
			j++;
			i++;
		}
	}

}
