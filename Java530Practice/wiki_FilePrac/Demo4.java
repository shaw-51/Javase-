package wiki_FilePrac;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import FilePrac1.Student;

/*
 * 4.在程序中创建一个Student类型的对象，并把对象信息保存到/io/student.txt文件中，然后再从文件中把Student对象的信息读出,
 * 
 *       并且把读出来的数据重新塞给一个对象,然后显示在控制台上
 */
public class Demo4 {

	
	public static void main(String[] args) throws IOException {
	Student astu=new Student("马化腾",85,95,105);
	File file=new File("io/student.txt");
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(file,true));
	bos.write(astu.toString().getBytes());
	bos.flush();
	bos.close();
	
	BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
	byte[]bytes=new byte[1024];
	bis.read(bytes);
	String newstu=new String(bytes);
	System.out.println(newstu);
	bis.close();
	
	
	
	}


}
