public class matrixAdditionAndMultiplication {

	public static void main(String[] args) 
	{
		
			int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
			int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
			      
			int y[][]=new int[3][3];  
			
			//matrix addition  
			System.out.println("matrix addition:");
			for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){ 
				
			y[i][j]=a[i][j]+b[i][j];
			
			System.out.print(y[i][j]+" ");    
			}    
			System.out.println(); 
			}
			System.out.println("matrix multiplication:");
	     //matrix multiplication
			 for(int i=0;i<3;i++){    
		     for(int j=0;j<3;j++){ 
		    	 y[i][j]=0; 
		     for(int k=0;k<3;k++) {
			y[i][j]+=a[i][k]*b[k][j];
				}
			System.out.print(y[i][j]+" ");    
			}    
			System.out.println(); 
			}    
}
}
