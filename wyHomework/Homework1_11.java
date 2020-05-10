package wyHomework;
/**
 * 11." 我是你的谁,我是你的剑 " 去除字符串左右空格
 * @author Administrator
 *
 */
public class Homework1_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" 我是你的谁,我是你的剑 ";
		String str1 = str.replaceAll(" ", "");
		System.out.println(str1);

	}

}
