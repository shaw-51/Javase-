package javaseProjects;
/*��10���ȵ��ַ�������,�����ַ����ĳ��Ƚ��н����������*/
public class Practice09 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String []arr=new String [10];
		arr[0]="acdcnjakc";
		arr[1]="fvfdbd";
		arr[2]="sc";
		arr[3]="dcd";
		arr[4]="cdax";
		arr[5]="s";
		arr[6]="xsasx";
		arr[7]="scscad";
		arr[8]="csaxsxss";
		arr[9]="scdccdscdscsd";
		int []are=new int [10];
		for(int i=0;i<10;i++){
			are[i]=arr[i].length();
			//System.out.println(are[i]);
		}
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				
				if(are[i]<=are[j]){
					int temp=are[i];
					are[i]=are[j];
					are[j]=temp;
					String sd="out";
					sd=arr[i];
					arr[i]=arr[j];
					arr[j]=sd;
				}
				
			}
			}
		for(int i=0;i<=9;i++){
			System.out.println(arr[i]);
		}
		
	}
}


