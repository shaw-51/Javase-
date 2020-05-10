package wyHomework;
/**
 * .找出 "我是你的谁,我是你的剑" 里面的 "你" 第一次出现的位置
    9.找到上面 8 题的 最后一次出现 "你" 的位置,然后再从 第4个位置开始找  第一次出现的"你"
 * @author Administrator
 *
 */
public class Homework1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我是你的谁,我是你的剑";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch=='你') {
				i++;
				System.out.println("字符串中'你'最后一次出现位置为"+i);
				break;
				
			}
		}
		
		
		
		for(int i=3;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='你') {
				i++;
				System.out.println("从第4个位置开始，字符串中'你'第一次出现位置为"+i);
				break;
				
			}
		}
		
	}

}
