package FilePrac1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 
  1.练习一
    复制文本文件
    
    复制图片——课上讲过了
   
     把ArrayList集合中的字符串数据存储到文本文件
     从文本文件中读取数据(每一行为一个字符串数据)到集合     并遍历集合
    
    复制单极文件夹
    
    复制单极文件夹中指定文件      并修改文件名称
    
    复制多极文件夹
    
    键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
 * @author Administrator
 *
 */
public class Copytst {
	public static void main(String []args) throws IOException {
	File f1=new File("a1.txt");
	File f2=new File("a2.txt");
	if(!f2.exists()) {
		f2.createNewFile();	
	}
	
	FileInputStream fis=new FileInputStream(f1);
	FileOutputStream fos=new FileOutputStream(f2);
	byte[] words=new byte[(int)f1.length()];
	fis.read(words);
	fos.write(words);
	
	System.out.println("复制文本文件完成");
		
		fis.close();
		fos.close();
	
	
	
	}
	

}
