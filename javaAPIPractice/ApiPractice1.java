package javaAPIPractice;
/**
 * 1:���������һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ��������
 * @author Administrator
 *
 */
public class ApiPractice1 {
	public int random(int min,int max) {
		return min+(int)(Math.random()*(max-min));
	}
	public static void main(String[]args) {
		ApiPractice1 p1=new ApiPractice1();
		int a=p1.random(4,60);
		System.out.println(a);
	}

}
