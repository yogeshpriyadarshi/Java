public class Bubble {

    public static void main(String[] args){
        int[] arr = {2,6,3,4,8,5};
        int n = arr.length;
        boolean sort=false;
        for(int i=0; i<n; i++){
            if(sort){
                break;
            }
             sort = true;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    sort = false;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<n;i++){
            System.out.println(arr[i]+"   ");
        }
    }   
}
