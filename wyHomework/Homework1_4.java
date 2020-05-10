package wyHomework;
/**
 *  4."我是你的谁,我是你的剑" 判断是否包含 "剑"
 * @author Administrator
 *
 */
public class Homework1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我是你的谁,我是你的剑";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='剑') {
				i++;
				System.out.println("字符串第"+i+"个位置包含‘剑’");
				break;
			}
		}

	}

}
