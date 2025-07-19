public class Selection {

    public static void main(String[] arrg){
        int[] arr = {4,5,2,1,9,6,7,3,5};
        int n=arr.length;
        int min;
        int index =0;
        for(int i=0; i<n; i++){
            min=Integer.MAX_VALUE;
            for(int j=i; j<n; j++){  //inner loop finds minumum from unsorted array
                if(arr[j]<min){
                    min=arr[j];
                   index=j;
                }
            }
            int temp=arr[i];
            arr[i]=min;
            arr[index]=temp;  
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i] +"  ");
        }


    }
    
}
