package javaseProjects;
//����д���������
//�벻����
/*public class Practice11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int triangel[][] =new int[10][];
		//���������һ��
		for(int i=0;i<triangel.length;i++) {
			triangel[i]=new int[i+1];//��ʼ���ڶ��������С
			
			//�����ڶ�������
			for(int j=0;j<i;j++) {
				if (i==0||j==0||j==i) {//�����������Ԫ�ظ�ֵΪ1
					triangel[i][j]=1;
				}else {
					triangel[i][j]=triangel[i-1][j]+triangel[i-1][j-1];
				}
				System.out.println(triangel[i][j]+"\t");
			}
			System.out.println();
		}


	}
*/
	public class Practice11 {
	       public static void main(String[] args) {
	              int m = 10, k = m * 2 - 1;
	              int[][] a = new int[m][k + 1];   //Ĭ��ȫ����0
	              // ��
	              for (int i = 0; i < a.length; i++) {
	                     //��
	                     for (int j = 0; j < k; j++) {
	                             //������ȫ����Ϊ1
	                            if (j == k / 2 - i || j == k / 2 + i) {
	                                   a[i][j] = 1;
	                            }
	                            //���м䲿�ְ���ʽ����
	                            if (j > m - i && j < m + i){
	                                   if (i == 0) {
	                                          continue;
	                                   } else {
	                                          //����ֵ������һ�е����������ǰһ��ֵ�ͺ�һ��ֵ�ĺ�
	                                          a[i][j] = a[i - 1][j - 1] +a[i - 1][j + 1];
	                                   }
	                            }
	                     }
	              }
	              //��ӡ������������
	              for (int i = 0; i < a.length; i++) {
	                     for (int j = 0; j < a[i].length; j++) {
	                            if (a[i][j] == 0) {
	                                   System.out.print(""+"\t");
	                            } else {
	                                   System.out.print(a[i][j]+"\t");
	                            }
	                     }
	                     System.out.println();
	              }
	       }
	}

