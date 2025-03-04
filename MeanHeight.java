import java.util.Scanner; // Import Scanner class for user input

class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         
       
        
		double heights[]=new double[11];
		for(int i=0;i<heights.length;i++){
			heights[i]=sc.nextDouble();
		}
		int sum=0;
		for(int i=0;i<heights.length;i++){
			sum+=heights[i];
		}
		int mean=sum/11;
		System.out.println("mean height of players present in a football team is "+mean);
	}
}
