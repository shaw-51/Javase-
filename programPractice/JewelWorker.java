package programPractice;
/*���Ÿù�˾��ҵ����չ���ù�˾�����Լ��������Σ��ù�˾����һ���µ����͵�Ա����
���ι��ˡ� 
�������ι����࣬ʵ��Ա���ӿڣ� 

���� 
�������ε����� 

���� 
1  �����������ε����� 
2  ��д���㹤�ʵķ��� 
����  ==  �����������ε�����  *50�� 
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
