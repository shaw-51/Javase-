package programPractice;
/**
 * 1������һ���������εĹ�˾�ࡣ 

����: 
һ������Ա�������顣

������
1, ���һ��Ա����
2,  ͨ��Ա����������ɾ��Ա����
3,  ͨ��Ա������������ʾԱ���Ĺ��ʡ�
4,  �������Ա���Ĺ��ʺ͡�

 * @author user
 *
 */
public class Company {
	static String worker[]=new String[900];
	static int i=0;
	static double salary[]=new double[900];//���鶨��Ҫ�ǵ�new!!!!
	/*public void getSalary(double salary){
		Company.salary[]=salary;
	}*/



	public String add1(HourlyWorker worker){   //���Ա��
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      //ע�⣺i��ֵ�ı�󲻻�������0
		return "��ӳɹ�";
	}
	
	
	public String add2(SaleWorker worker){   //���Ա��
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      
		return "��ӳɹ�";
	}
	
	public String add3(NomalWorker worker){   //���Ա��
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      
		return "��ӳɹ�";
	}
	
	public String add4(JewelWorker worker){   //���Ա��
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      
		return "��ӳɹ�";
	}
	
	
	
	public String delete(String name){    //����Ա������ɾ��Ա��
		boolean flag=true;
		for(int j=0;j<Company.i;j++){
			if(name.equals(Company.worker[j])){
				for(int k=j;k<Company.i;k++)
				Company.worker[k]=Company.worker[k+1];
				Company.i--;
			
			}
			else{
				flag=false;
				
			}
		}
		if(flag){
			return "ɾ���ɹ�...";
			
		}
		else return "ɾ��ʧ��...";
	}
	
	public void show(String name){   //ͨ��Ա������������ʾԱ���Ĺ��ʡ�
		boolean flag= true;
		
		for(int j=0;j<Company.i;j++){
			
			if(name.equals(Company.worker[j])){
			
				System.out.println(	);
			
			}
			
			else
			
				flag=false;
		
		}	
		
		if(!flag){
			System.out.println("���޴���");
		}		
	}
	//�������Ա���Ĺ��ʺ�
	public void Sum(){
		double sum=0;
		for(int j=0;j<Company.i;j++){
			sum+=Company.salary[j];
		}
		System.out.println("�����˵Ĺ���֮��Ϊ"+sum);
	}
		
	
	
	

}


