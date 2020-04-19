package programPractice;
/*随着该公司的业务扩展，该公司决定自己生产首饰，该公司多了一种新的类型的员工，
首饰工人。 
定义首饰工人类，实现员工接口： 

属性 
生产首饰的数量 

方法 
1  设置生产首饰的数量 
2  重写计算工资的方法 
工资  ==  设置生产首饰的数量  *50； 
*/
public class JewelWorker implements WorkerInterface{
	public String name;
	private int number;
	
	public JewelWorker(String name){
		this.name=name;
		
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public double Calculator(){
		return number*50;
	}; 
	
	

}
