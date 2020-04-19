package programPractice;
/**
 * 小时工类，实现员工接口 

属性： 
工作的小时，每小时工资。 

方法： 
1. 设置工作的小时 
2. 设置每小时的工资。 
3. 重写计算工资方法： 
小时工没有基本工资，他的工资就是工作的小时*每小时工资。 
 * @author user
 *
 */
public class HourlyWorker implements WorkerInterface{
	private float workTime;  //工作时间
	private double wage;  //每小时工资
	public String name;
	
	public HourlyWorker(String name){
		this.name=name;
	}
	
	
	public void setWorktime(float worktime) {
		this.workTime = worktime;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	
	@Override
	public double Calculator(){   //工资算法
		return this.wage*this.workTime;   //  工作的小时*每小时工资。
	}
	

}
