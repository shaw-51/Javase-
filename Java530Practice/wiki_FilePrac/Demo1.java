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
 * 1.�ҵ�ָ���ļ�������Ŀ¼��������е�txt�ļ�,���Ұ������������ļ�ȫ����ȡ����д�뵽��һ��txt�ļ�����ȥ(ʹ�õݹ����)
 * 
 * 2.�����ֽ������߻����ֽ����ķ�ʽ��ָ���ĸ�ʽ�������� ��:xxx,xxx,xxx,���һ�������� .�Ž�����һ������������
 * 
 * 3.����a/test.txt�ļ�������������"hello world",����һ����������ȡ���ļ��е��ı�,���Ұ�Сд��l��ɴ�дL�����������д�뵽b/test.txt��
 * 
 * 4.�ڳ����д���һ��Student���͵Ķ��󣬲��Ѷ�����Ϣ���浽/io/student.txt�ļ��У�Ȼ���ٴ��ļ��а�Student�������Ϣ����,
 * ���ҰѶ�������������������һ������,Ȼ����ʾ�ڿ���̨��
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
				System.out.println("��ȡ���");
			
					
				
			}
		}
	}
	
	
}

