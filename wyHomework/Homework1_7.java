package wyHomework;
/**
 *  7.找到此字符串"我是你的小宝贝"的 "我" 进行输出
 * @author Administrator
 *
 */
public class Homework1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="我是你的小宝贝";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='我') {
				System.out.println("目标字符为"+ch);
				break;
			}
		}

	}

}
