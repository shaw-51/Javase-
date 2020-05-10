package javaAPIPractice;
/**
 * 2.定义一个StringBuffer类对象，
1）使用append方法向对象中添加26个字母，并倒序遍历输入
2）删除前五个字符

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
