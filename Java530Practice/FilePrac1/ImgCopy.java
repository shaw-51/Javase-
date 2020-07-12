package FilePrac1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImgCopy {
	public static void main(String []args) throws IOException {
		File file=new File("img/1.jpg");
		File file2=new File("img/2.jpg");
		if(!file2.exists()) {
			file2.createNewFile();
		}
		
		FileInputStream fileInputStream=new FileInputStream(file);
		byte[]b=new byte[(int)file.length()];
		fileInputStream.read(b);
		fileInputStream.close();
		
		FileOutputStream fileOutputStream=new FileOutputStream(file2);
		fileOutputStream.write(b);
		fileOutputStream.close();	
	}

}
