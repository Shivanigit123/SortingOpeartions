/*In insertion sort,we choose one element and compare(check lesser or greater) to other element(n to 0)
if i got correct element so i have to insert its position. */
class InsertionSort{
    public static void main(String[] args){
	int [] arrayList={12,11,3,4,5,1};
	//taking two variables...
	int tempVariable1,tempVariable2;
	for(int i=1;i<arrayList.length;i++){//length of arrayList=6; 
		tempVariable1=arrayList[i];
		tempVariable2=i;
		while(tempVariable2>0 && arrayList[tempVariable2-1]>tempVariable1){
			arrayList[tempVariable2]=arrayList[tempVariable2-1];
			tempVariable2=tempVariable2-1;
		}
		arrayList[tempVariable2]=tempVariable1;
	}
	System.out.println("Sorted array by Insertion Sort");
	for(int j=0;j<arrayList.length;j++){
	  System.out.print(arrayList[j]+" ,");
	}

    }
}

		