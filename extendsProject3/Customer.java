package extendsProject3;
/*B.����Customer�ࡣ
a. ��������˽�ж�������:firstName��lastName��account��
b. ����һ�����й�����,���������������������������ԵĲ���(f��l)
c. �����������д�ȡ�������ʸö�������,����getFirstName��getLastName������Ӧ�����ԡ�
d. ����setAccount ��������account���Ը�ֵ�� 
e. ����getAccount �����Ի�ȡaccount���ԡ�*/
public class Customer extends Account{
	private String firstName;
	private String lastName;
	private long account;
	public Customer(){
		
	}
	public Customer(String f,String l){
		this.firstName=f;
		this.lastName=l;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getAccount() {
		return account;
	}
	public void setAccount(long account) {
		this.account = account;
	}
	public void display(){
		System.out.println("Customer ["+this.lastName+","+ this.firstName+"] has a account: id is "+ this.getId()+",annualInterestRate is "+this.getAnnual()+", balance is "+this.getBalance());
	}
	
	
	

}
