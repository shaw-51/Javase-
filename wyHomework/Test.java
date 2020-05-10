package wyHomework;

import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String []args) {
		System.out.println('a'-'A');
		 byte[] t=new byte[] {1,2,3,5,6,4};
		// System.out.println(t.toString());//������ǹ�ϣֵ
		 String strRead = null;
		try {
			strRead = new String(t,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 strRead = String.copyValueOf(strRead.toCharArray(), 0,t.length);
		 System.out.println(strRead);
		 
		 char a='a';
		 System.out.println(++a);


	}

}
