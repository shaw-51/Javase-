package programPractice;
/**
 * ����Ա���࣬ʵ��Ա���ӿ� 

���ԣ� 
���۵��ܽ�� 
��������

���� 
1. �������۵��ܽ�� 

2. ��д���㹤�ʷ����� 
��������+��ɡ� 
��ɵļ��㣺 
�����۶���10000 ����ʱ�������10%�� 
�����۶���10000-100000֮���ǣ������15%�� 
�� 100000�����ǣ����18%�� 

 * @author user
 *
 */
public class SaleWorker implements WorkerInterface{
	private double saleSum;  //�����ܶ�
	private static final double baseSalary=5000;  //���û�������Ϊ5000
	public String name;
	
	public SaleWorker(String name){
		this.name=name;
	}
	
	public void setSaleSum(double saleSum) {   //�������۽��
		this.saleSum = saleSum;
	}
	
	@Override
	public double Calculator(){
		double sum=SaleWorker.baseSalary;
		double commission=0;
		if(this.saleSum<10000){
			 commission=this.saleSum*0.1;
		}
		else{
			 commission=this.saleSum*0.15;
		}
		return sum+commission;
	}

}
