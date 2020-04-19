package programPractice;
/**
 * 1）制作一个销售首饰的公司类。 

属性: 
一个保存员工的数组。

方法：
1, 添加一个员工。
2,  通过员工的名字来删除员工。
3,  通过员工的名字来显示员工的工资。
4,  输出所有员工的工资和。

 * @author user
 *
 */
public class Company {
	static String worker[]=new String[900];
	static int i=0;
	static double salary[]=new double[900];//数组定义要记得new!!!!
	/*public void getSalary(double salary){
		Company.salary[]=salary;
	}*/



	public String add1(HourlyWorker worker){   //添加员工
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      //注意：i的值改变后不会再跳回0
		return "添加成功";
	}
	
	
	public String add2(SaleWorker worker){   //添加员工
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      
		return "添加成功";
	}
	
	public String add3(NomalWorker worker){   //添加员工
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      
		return "添加成功";
	}
	
	public String add4(JewelWorker worker){   //添加员工
		Company.worker[Company.i]=worker.name;   
		Company.salary[Company.i]= worker.Calculator() ;
		Company.i++;                      
		return "添加成功";
	}
	
	
	
	public String delete(String name){    //根据员工名字删除员工
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
			return "删除成功...";
			
		}
		else return "删除失败...";
	}
	
	public void show(String name){   //通过员工的名字来显示员工的工资。
		boolean flag= true;
		
		for(int j=0;j<Company.i;j++){
			
			if(name.equals(Company.worker[j])){
			
				System.out.println(	);
			
			}
			
			else
			
				flag=false;
		
		}	
		
		if(!flag){
			System.out.println("查无此人");
		}		
	}
	//输出所有员工的工资和
	public void Sum(){
		double sum=0;
		for(int j=0;j<Company.i;j++){
			sum+=Company.salary[j];
		}
		System.out.println("所有人的工资之和为"+sum);
	}
		
	
	
	

}


