package javaAPIPractice;
/**
 * 4. ��дһ�����򣬽������һ���ı��еĸ������ʵ���ĸ˳��ת��
��To be or not to be"�������"oT eb ro ton ot eb."��
 * @author Administrator
 *
 */
public class ApiPractice4 {
	static int block[]=new int[20];
	static int start=1;
	public static String strReverse(String str) {
		String strNew="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				block[start++]=i;
				for(int j=i-1;j>=block[start-2];j--) {
					strNew+=str.charAt(j);
				}
				strNew+=str.charAt(i);
			}
			
		}
		return strNew;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="To be or not to be ";
		String strNew=strReverse(str);
		System.out.println("ת��֮ǰ�� "+str);
		System.out.println("ת��֮�� "+strNew);

	}

}
