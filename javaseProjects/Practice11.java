package javaseProjects;
//尝试写出杨辉三角
//想不出来
/*public class Practice11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int triangel[][] =new int[10][];
		//遍历数组第一层
		for(int i=0;i<triangel.length;i++) {
			triangel[i]=new int[i+1];//初始化第二层数组大小
			
			//遍历第二层数组
			for(int j=0;j<i;j++) {
				if (i==0||j==0||j==i) {//将两侧的数组元素赋值为1
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
	              int[][] a = new int[m][k + 1];   //默认全部是0
	              // 行
	              for (int i = 0; i < a.length; i++) {
	                     //列
	                     for (int j = 0; j < k; j++) {
	                             //将两侧全部置为1
	                            if (j == k / 2 - i || j == k / 2 + i) {
	                                   a[i][j] = 1;
	                            }
	                            //将中间部分按公式计算
	                            if (j > m - i && j < m + i){
	                                   if (i == 0) {
	                                          continue;
	                                   } else {
	                                          //它的值等于上一行的相对于它的前一项值和后一项值的和
	                                          a[i][j] = a[i - 1][j - 1] +a[i - 1][j + 1];
	                                   }
	                            }
	                     }
	              }
	              //打印输出杨辉三角形
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

