package FilePrac1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制单极文件夹中指定文件      并修改文件名称
 */
public class SingleSpecCopy {
	public static void main(String[]args) throws IOException {
			File src=new File("Sfile");
			File dest=new File("Dfile2");
			if(!dest.exists()) {
				dest.mkdir();
			}
			File[] file=src.listFiles();
			
			for(File f:file) {
				if(f.getName().equals("tst1.txt")) {
				String name="copy"+f.getName();
			//	System.out.println(name);
				File nfile=new File(dest,name);
				copyFile(f,nfile);
				}
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
