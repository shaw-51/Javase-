package FilePrac1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * ��ArrayList�����е��ַ������ݴ洢���ı��ļ�
 * 
 * ���ı��ļ��ж�ȡ����(ÿһ��Ϊһ���ַ�������)������     ����������
 */
public class ArrayListCopy {
	public static void main(String []args) throws IOException {
	ArrayList <String>array=new ArrayList<String>();
	array.add("�廪");
	array.add("����");
	array.add("���");
	array.add("����");
	File f1=new File("a.txt");
	if(!f1.exists()) {
		f1.createNewFile();
	}
	FileWriter fw=new FileWriter(f1);
	BufferedWriter bw=new BufferedWriter(fw);
	
	for(String s:array) {
		bw.write(s);
		bw.newLine();
		bw.flush();
	}
	bw.close();
	
	ArrayList<String> array2=new ArrayList<>();
	FileReader fr=new FileReader(f1);
	BufferedReader br=new BufferedReader(fr);
	String line;
	while((line=br.readLine())!=null) {
		array2.add(line);
	}
	br.close();
	
	for(String s:array2) {
		System.out.println(s);
	}
	
	}

}
