package programPractice;
/**
 * 6���� main  ���������� 
һ����˾���� 
һ��Сʱ���Ķ���ÿСʱ����10������ 200 Сʱ�� 
һ��Сʱ���Ķ���ÿСʱ����10������ 230 Сʱ�� 
һ������Ա���Ķ������۶�5000�� 
һ������Ա���Ķ������۶�200000�� 
һ����ͨԱ�����󣬹���Сʱ205 Сʱ�� 
������Ա��������빫˾�����У�Ȼ������������Ա�����ʺ͵ķ������鿴�ù�˾����Ӧ
�÷��Ĺ����ܺ͡� 
 * @author user
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Company companyA=new Company();
		HourlyWorker workerA=new HourlyWorker("ԭҰ��֮��");
		workerA.setWage(10);
		workerA.setWorktime(200);
		
		HourlyWorker workerB=new HourlyWorker("ԭҰ��֮��");
		workerB.setWage(10);
		workerB.setWorktime(230);
		
		SaleWorker workerC=new SaleWorker("Գ����ն");
		workerC.setSaleSum(5000);
		
		SaleWorker workerD=new SaleWorker("־���Ų�");
		workerD.setSaleSum(200000);
		
		NomalWorker workerE=new NomalWorker("������");
		workerE.setWorktime(205);
		
		
		companyA.add1(workerA);
		companyA.add1(workerB);
		companyA.add2(workerC);
		companyA.add2(workerD);
		companyA.add3(workerE);
		
		companyA.Sum();
		
		
		/* ��main �����ж�����һ�����ι��˶����������ε�����30�� 
���ö�����빫˾�����У� 
Ȼ������������Ա�����ʺ͵ķ������鿴�ù�˾����Ӧ�÷��Ĺ����ܺ͡� */
		JewelWorker workerF=new JewelWorker("���ǲ���");
		workerF.setNumber(30);
		companyA.add4(workerF);
		companyA.Sum();
		
		
		
		
		
	}

}
