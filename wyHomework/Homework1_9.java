package wyHomework;
/**
 * .�ҳ� "�������˭,������Ľ�" ����� "��" ��һ�γ��ֵ�λ��
    9.�ҵ����� 8 ��� ���һ�γ��� "��" ��λ��,Ȼ���ٴ� ��4��λ�ÿ�ʼ��  ��һ�γ��ֵ�"��"
 * @author Administrator
 *
 */
public class Homework1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="�������˭,������Ľ�";
		
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch=='��') {
				i++;
				System.out.println("�ַ�����'��'���һ�γ���λ��Ϊ"+i);
				break;
				
			}
		}
		
		
		
		for(int i=3;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='��') {
				i++;
				System.out.println("�ӵ�4��λ�ÿ�ʼ���ַ�����'��'��һ�γ���λ��Ϊ"+i);
				break;
				
			}
		}
		
	}

}
