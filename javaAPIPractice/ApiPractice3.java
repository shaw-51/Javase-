package javaAPIPractice;
/**
 * 3.���ַ�����ָ�����ֽ��з�ת��
 * @author Administrator
 *
 */
public class ApiPractice3 {

	public static void main(String[] args) {
		 String str = "helloabcdworld";
	        // ��ʼλ�õ��±�
	        int start = 5;
	        // ����λ�õ��±�
	        int end = 8;
	        System.out.println("ԭ�ȵ��ַ���: "+str);
	        String strNew=strReverse(str, start, end);
	        System.out.println("ָ�����ֽ��з�ת����ַ���: "+strNew);
	}
	
	  private static String strReverse(String str, int start, int end) {
	        // ���ַ�����ͷ��Ҫ��ת��λ�õ��ַ�����ȡ����
		  
		  
	        // �ڴ˲��Դ����У���Ҫ��תabcd.  start=5,��˽�ȡ����hello
	        String strNew = str.substring(0, start);
	        
	        // ����ѭ���ķ�ʽ��endλ�ÿ�ʼ����ȡֵ��׷�ӵ���ȡ���Ӵ�����
	        for (int i = end; i >= start; i--) {
	        
	        	// charAt() ��ȡָ��λ�õ�ֵ
	            strNew += str.charAt(i);
	        }
	        
	        // substring() ��ȡ�Ӵ���׷�ӵ�strNew����
	        strNew += str.substring(end + 1);
	        return strNew;
	    }

}
