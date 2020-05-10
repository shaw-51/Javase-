package wyHomework;
//3."abcdw" "ABCDw" 比较两个字符串是否相等  忽略大小写
public class Homework1_3 {
	
	public static void main(String []args) {
		String str= "abcdw";
		String str2="ABCD";
		int i=0;
				
		if(str.length()!=str2.length()) {
			System.out.println("不同");
		}
		
		else {
		
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			char ch1=str2.charAt(i);
			if(ch==ch1||ch==ch1+32||ch+32==ch1) {
				continue;
			}
			else {
				System.out.println("不同");
				break;
			}
		}
		}
		if(i==str.length()) {
			System.out.println("相同");
		}
	
		
	}

}
