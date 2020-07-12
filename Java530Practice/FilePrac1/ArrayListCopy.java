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
 * 把ArrayList集合中的字符串数据存储到文本文件
 * 
 * 从文本文件中读取数据(每一行为一个字符串数据)到集合     并遍历集合
 */
public class ArrayListCopy {
	public static void main(String []args) throws IOException {
	ArrayList <String>array=new ArrayList<String>();
	array.add("清华");
	array.add("北大");
	array.add("浙大");
	array.add("复旦");
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
