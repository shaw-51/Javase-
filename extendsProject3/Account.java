package extendsProject3;
/*A.дһ����ΪAccount����ģ���˻����������������:�˺�id,���balance,������annualInterestRate;
�����ķ���: ����������(getter��setter����),
           ȡ���withdraw(),
           ����deposit()��
��ʾ:������withdraw��,��Ҫ�ж��û�����Ƿ��ܹ�������������Ҫ��,�������,Ӧ������ʾ��*/

public class Account {
	private long id; //�˺�
	private double balance; //���
	private double annual=0.005;  //������
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnual() {
		return annual;
	}
	public void setAnnual(double annual) {
		this.annual = annual;
	}
	public Account(){
		
	}
	public Account(long id,double balance,double annual){
		this.id=id;
		this.balance=balance;
		this.annual=annual;
	}
	public void withdraw(double withdrawal){   //ȡ���   withdrawal  ȡ������
		if(withdrawal>0&&withdrawal<=this.balance&&(withdrawal-Math.floor(withdrawal)==0)){  //ȡ������ܳ�������Ϊ����
			this.balance-=withdrawal;
			System.out.println("ȡ��"+withdrawal+"�ɹ�...");
		}
		else{
			System.out.println("ȡ��ʧ��...ע�����С����ȡ�����Ϊ����");
			}
	}
	public void deposit(long amount){ //amount  �����
		this.balance+=amount;
		System.out.println("�ɹ���"+amount);
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annual=" + annual + "]";
		
	}
	

}
