package wyHomework;
/**
 *  4."�������˭,������Ľ�" �ж��Ƿ���� "��"
 * @author Administrator
 *
 */
public class Homework1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="�������˭,������Ľ�";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='��') {
				i++;
				System.out.println("�ַ�����"+i+"��λ�ð���������");
				break;
			}
		}

	}

}
