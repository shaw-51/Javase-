package FilePrac1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制多极文件夹
 */
public class MultiFileCopy {

	public static void main(String[] args) throws IOException {
		File srcFolder=new File("MultiSrcFolder");
		File destFolder=new File("MultiDestFolder");
		if(!destFolder.exists()) {
			destFolder.mkdir();
		}
		cp(srcFolder,destFolder);

	}

	public static void cp(File srcFolder, File destFolder) throws IOException {
		  File [] files=srcFolder.listFiles();
		  
		  for(File f:files) {
			  if(f.isFile()) {
				  BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
				  File newFile=new File(destFolder,f.getName());//新文件名
				  BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream(newFile));
				  byte[]bys=new byte[1024];
				  int len=0;
				  while((len=bis.read(bys))!=-1) {
					  bos.write(bys,0,len);
				  }			  
				}
			  if(f.isDirectory()) {
				  File newDir=new File(destFolder,f.getName());
				  newDir.mkdir();
				  cp(f,newDir);
			  }

			  }
		  }
}
