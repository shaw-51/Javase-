package javaAPIPractice;
/**
 * 2.����һ��StringBuffer�����
1��ʹ��append��������������26����ĸ���������������
2��ɾ��ǰ����ַ�

 * @author Administrator
 *
 */
public class ApiPractice2 {
	static char a='Z';
	public static void main(String[]args) {
		StringBuffer strbuf=new StringBuffer(30);
		for(int i=25;i>=0;i--) {
			strbuf.append(a--);
		}
		System.out.println(strbuf.toString());
		
		strbuf.delete(0,4);
		System.out.println(strbuf.toString());
	}

}
