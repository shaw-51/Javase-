package extendsProject3;
/*Cдһ�����Գ���
(1)����һ��Customer ,���ֽ� Jane Smith, ����һ���˺�Ϊ1000,���Ϊ2000Ԫ,������Ϊ 1.23% ���˻���
(2)��Jane Smith������
���� 100 Ԫ,��ȡ��960Ԫ����ȡ��2000Ԫ����ӡ��Jane Smith �Ļ�����Ϣ
�ɹ����� :100.0,�ɹ�ȡ��:960.0,����,ȡ��ʧ��
Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23%, balance is 1140.0
������仰��Customer �������һ��display���� ������ʱ�� ������������*/
public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Customer customer=new Customer("Jane","Smith");
		customer.setId(1000);
		customer.setBalance(2000);
		customer.setAnnual(0.0123);
		customer.deposit(100);  //����һ��Ԫ
		customer.withdraw(960);  //ȡ��960Ԫ
		customer.withdraw(2000);  //ȡ��2000Ԫ
		customer.display();
		
		

	}

}
