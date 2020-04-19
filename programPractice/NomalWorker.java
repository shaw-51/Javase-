package programPractice;
/**
 * 普通员工类，实现员工接口 

属性： 
工作的小时 
基本工资

方法： 
1. 设置工作的小时 
2. 重写计算工资的方法： 
当每月工作的小时数超过196 小时时，超出的部分按每小时200 元。 
基本工资+（工作的小时-196）*200。
 * @author user
 *
 */
public class NomalWorker implements WorkerInterface{
	private float workTime;
	private static final double baseSalary=2000;   //设置基本工资为2000
	public String name;
	
	public NomalWorker(String name){
		this.name=name;
	}
	
	public void setWorktime(float workTime) {
		this.workTime = workTime;
	}
	
	@Override
	public double Calculator(){
		double sum=NomalWorker.baseSalary;
		double overage=0;
		if(this.workTime>196){
			overage=200*(this.workTime-196);
		}
		return sum+overage;
	}
    
	

}
