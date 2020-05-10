package wyHomework;
/**
 *  12. "我是你的谁,我是你的剑"  替代字符串里面的"谁",改为"被子"
 * @author Administrator
 *
 */
public class Homework1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我是你的谁,我是你的剑";
		String str1 = str.replaceAll("谁", "被子");
		System.out.println(str1);
		

	}

}
