package FilePrac1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制单极文件夹
 */
public class SingleCopy {
	public static void main(String[]args) throws IOException {
		File src=new File("Sfile");
		File dest=new File("Dfile");
		if(!dest.exists()) {
			dest.mkdir();
		}
		File[] file=src.listFiles();
		
		for(File f:file) {
			String name=f.getName();
		//	System.out.println(name);
			File nfile=new File(dest,name);
			copyFile(f,nfile);
		}
	}
	
	public static void copyFile(File file,File newfile) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newfile));
		
		byte[]bys=new byte[1024];
		int len=0;
		while((len=bis.read(bys))!=-1) {
			bos.write(bys,0,len);
		}
		bos.close();
		bis.close();
		
	}

}


