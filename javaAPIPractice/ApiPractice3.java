package javaAPIPractice;
/**
 * 3.将字符串中指定部分进行反转。
 * @author Administrator
 *
 */
public class ApiPractice3 {

	public static void main(String[] args) {
		 String str = "helloabcdworld";
	        // 开始位置的下标
	        int start = 5;
	        // 结束位置的下标
	        int end = 8;
	        System.out.println("原先的字符串: "+str);
	        String strNew=strReverse(str, start, end);
	        System.out.println("指定部分进行反转后的字符串: "+strNew);
	}
	
	  private static String strReverse(String str, int start, int end) {
	        // 把字符串从头到要反转的位置的字符串截取出来
		  
		  
	        // 在此测试代码中，需要反转abcd.  start=5,因此截取的是hello
	        String strNew = str.substring(0, start);
	        
	        // 利用循环的方式从end位置开始遍历取值，追加到截取的子串后面
	        for (int i = end; i >= start; i--) {
	        
	        	// charAt() 获取指定位置的值
	            strNew += str.charAt(i);
	        }
	        
	        // substring() 截取子串，追加到strNew后面
	        strNew += str.substring(end + 1);
	        return strNew;
	    }

}
