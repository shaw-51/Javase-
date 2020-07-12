package wiki_FilePrac;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 1.找到指定文件及其子目录下面的所有的txt文件,并且把满足条件的文件全部读取出来写入到另一个txt文件里面去(使用递归完成)
 * 
 * 2.利用字节流或者换成字节流的方式以指定的格式输入数据 如:xxx,xxx,xxx,最后一个数据以 .号结束，一行最多五个数据
 * 
 * 3.创建a/test.txt文件并在其中输入"hello world",创建一个输入流读取该文件中的文本,并且把小写的l变成大写L再利用输出流写入到b/test.txt中
 * 
 * 4.在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，然后再从文件中把Student对象的信息读出,
 * 并且把读出来的数据重新赛给一个对象,然后显示在控制台上
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		File f1=new File("DestFile.txt");
		File f2=new File("SrcFolder");
		if(!f1.exists()) {
			f1.createNewFile();
		}
		if(!f2.exists()) {
			f2.createNewFile();
		}
		earch(f2,f1);
	}
	
    public  static void earch(File file1,File file2) throws IOException {
		File[] files=file1.listFiles();
		for(File f:files) {
			if(f.isDirectory()) {
				earch(f,file2);
			}
			if(f.isFile()) {
				
				FileInputStream fis=new FileInputStream(f);
				FileOutputStream fos=new FileOutputStream(file2,true);
				byte[] bytes=new byte[(int)f.length()];
				fis.read(bytes);
				fos.write(bytes);
				fis.close();
				fos.close();
				System.out.println("读取完成");
			
					
				
			}
		}
	}
	
	
}

