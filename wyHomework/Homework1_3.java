package wyHomework;
//3."abcdw" "ABCDw" �Ƚ������ַ����Ƿ����  ���Դ�Сд
public class Homework1_3 {
	
	public static void main(String []args) {
		String str= "abcdw";
		String str2="ABCD";
		int i=0;
				
		if(str.length()!=str2.length()) {
			System.out.println("��ͬ");
		}
		
		else {
		
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			char ch1=str2.charAt(i);
			if(ch==ch1||ch==ch1+32||ch+32==ch1) {
				continue;
			}
			else {
				System.out.println("��ͬ");
				break;
			}
		}
		}
		if(i==str.length()) {
			System.out.println("��ͬ");
		}
	
		
	}

}
