package wyHomework;
/**
 * 8.找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
 * @author Administrator
 *
 */
public class Homework1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我是你的谁,我是你的剑";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='你') {
				i++;
				System.out.println("字符串中'你'第一次出现位置为"+i);
				break;
				
			}
		}

	}

}
