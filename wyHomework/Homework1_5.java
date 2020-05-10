package wyHomework;
/**
 *   4."我是你的谁,我是你的剑" 判断是否包含 "剑"
      5.第四题字符串判断是否以"我"开头,判断是否以"剑"结尾
 * @author Administrator
 *
 */
public class Homework1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我是你的谁,我是你的剑";
		char ch=str.charAt(0);
		char ch1=str.charAt(str.length()-1);
		if(ch=='我'&&ch1=='剑') {
			System.out.println("是的");
		}
		else {
			System.out.println("不是的");
		}

	}

}
