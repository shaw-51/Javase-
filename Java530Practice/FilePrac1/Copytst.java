package FilePrac1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/***
 
  1.��ϰһ
    �����ı��ļ�
    
    ����ͼƬ�������Ͻ�����
   
     ��ArrayList�����е��ַ������ݴ洢���ı��ļ�
     ���ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)������     ����������
    
    ���Ƶ����ļ���
    
    ���Ƶ����ļ�����ָ���ļ�      ���޸��ļ�����
    
    ���ƶ༫�ļ���
    
    ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
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
	
	System.out.println("�����ı��ļ����");
		
		fis.close();
		fos.close();
	
	
	
	}
	

}
