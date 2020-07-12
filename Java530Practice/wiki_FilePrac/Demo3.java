package wiki_FilePrac;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/*
 *  3.创建a/test.txt文件并在其中输入"hello world",创建一个输入流读取该文件中的文本,并且把小写的l变成大写L再利用输出流写入到b/test.txt中
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		File f1=new File("a/test.txt");
		if(!f1.exists()) {
			f1.createNewFile();
			System.out.println("创建完成!");
		}
		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f1));
		byte[]bytes=new byte[1024];
		bis.read(bytes);
		String str=new String(bytes);
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='l') {
				ch[i]='L';
			}
		}
		
		String str2=String.valueOf(ch);
		bis.close();
		File f2=new File("b/test.txt");
		if(!f2.exists()) {
			f2.createNewFile();
		}
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(f2,true));
		bos.write(str2.getBytes());
		bos.flush();
		bos.close();
		
		

	}
	
}
