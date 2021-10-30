import java.util.*;
class BubbleSort{
   public static void main(String [] args){
	Scanner sc=new Scanner();
	System.out.println("Enter number of array");
	System.out.println(System.in);
	sc.nextInt();
	int[] arrayList=new Int();
	performBubbleSort(arrayList);
	//int [] unsortedArray={55,44,33,22,11};
   public static void performBubbleSort(int [] inputFromUser){ 
		int temp;
    	 for(int i=0;i<unsortedArray.length;i++){
		for(int j=0;j<unsortedArray.length-1;j++){
		 	if(unsortedArray[j] > unsortedArray[j+1]){
			 	temp=unsortedArray[j];
			 	unsortedArray[j]=unsortedArray[j+1];
			 	unsortedArray[j+1]=temp;
				
			}
		}
    	 }
	for(int j=0;j<unsortedArray.length;j++){
	  System.out.println("Sorted Array is " + unsortedArray[j]);
	 }
   }
   }
}