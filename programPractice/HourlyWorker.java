package programPractice;
/**
 * Сʱ���࣬ʵ��Ա���ӿ� 

���ԣ� 
������Сʱ��ÿСʱ���ʡ� 

������ 
1. ���ù�����Сʱ 
2. ����ÿСʱ�Ĺ��ʡ� 
3. ��д���㹤�ʷ����� 
Сʱ��û�л������ʣ����Ĺ��ʾ��ǹ�����Сʱ*ÿСʱ���ʡ� 
 * @author user
 *
 */
public class HourlyWorker implements WorkerInterface{
	private float workTime;  //����ʱ��
	private double wage;  //ÿСʱ����
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
	public double Calculator(){   //�����㷨
		return this.wage*this.workTime;   //  ������Сʱ*ÿСʱ���ʡ�
	}
	

}
