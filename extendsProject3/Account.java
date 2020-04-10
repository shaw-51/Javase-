package extendsProject3;
/*A.写一个名为Account的类模拟账户。该类包括的属性:账号id,余额balance,年利率annualInterestRate;
包含的方法: 访问器方法(getter和setter方法),
           取款方法withdraw(),
           存款方法deposit()。
提示:在提款方法withdraw中,需要判断用户余额是否能够满足提款数额的要求,如果不能,应给出提示。*/

public class Account {
	private long id; //账号
	private double balance; //余额
	private double annual=0.005;  //年利率
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
	public void withdraw(double withdrawal){   //取款方法   withdrawal  取款数额
		if(withdrawal>0&&withdrawal<=this.balance&&(withdrawal-Math.floor(withdrawal)==0)){  //取款数额不能超过余额，且为整数
			this.balance-=withdrawal;
			System.out.println("取款"+withdrawal+"成功...");
		}
		else{
			System.out.println("取款失败...注意金额大小，且取款必须为整数");
			}
	}
	public void deposit(long amount){ //amount  存款数
		this.balance+=amount;
		System.out.println("成功存款："+amount);
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", annual=" + annual + "]";
		
	}
	

}
