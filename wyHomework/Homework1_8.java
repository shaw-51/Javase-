package wyHomework;
/**
 * 8.�ҳ� "�������˭,������Ľ�" ����� "��" ��һ�γ��ֵ�λ��
 * @author Administrator
 *
 */
public class Homework1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="�������˭,������Ľ�";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='��') {
				i++;
				System.out.println("�ַ�����'��'��һ�γ���λ��Ϊ"+i);
				break;
				
			}
		}

	}

}
