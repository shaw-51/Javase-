package programPractice;
/**
 * ��ͨԱ���࣬ʵ��Ա���ӿ� 

���ԣ� 
������Сʱ 
��������

������ 
1. ���ù�����Сʱ 
2. ��д���㹤�ʵķ����� 
��ÿ�¹�����Сʱ������196 Сʱʱ�������Ĳ��ְ�ÿСʱ200 Ԫ�� 
��������+��������Сʱ-196��*200��
 * @author user
 *
 */
public class NomalWorker implements WorkerInterface{
	private float workTime;
	private static final double baseSalary=2000;   //���û�������Ϊ2000
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
