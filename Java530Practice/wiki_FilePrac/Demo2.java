package wiki_FilePrac;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  2.利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
 */
public class Demo2 {
	static int i=1;
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入九个数据");
		System.out.println("输入数据：");
		for(int k=0;k<9;k++){
		    String s=sc.nextLine();
		    putIn(s);
		}
	}
	public static void putIn(String s) throws IOException {
		String s2="";
		FileOutputStream fos=new FileOutputStream(new File("wikidemo2.txt"),true);
		if(i==1) {
			s2=s+",";
			i++;
			
		}
		else if(i%5==1) {
			fos.write("\r\n".getBytes());
			s2=s+",";
			i++;
		}
		else if(i%5==0){
			s2=s+".";
			i++;
		}
		else{
			s2=s+",";
			i++;
		}
		fos.write(s2.getBytes());
		fos.flush();
		fos.close();
		
	}
}
