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
 * 4.�ڳ����д���һ��Student���͵Ķ��󣬲��Ѷ�����Ϣ���浽/io/student.txt�ļ��У�Ȼ���ٴ��ļ��а�Student�������Ϣ����,
 * 
 *       ���ҰѶ�������������������һ������,Ȼ����ʾ�ڿ���̨��
 */
public class Demo4 {

	
	public static void main(String[] args) throws IOException {
	Student astu=new Student("����",85,95,105);
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
