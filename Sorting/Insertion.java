public class Insertion {

    public static void main(String[] args){
        int[] arr = {1,5,2,5,8,6,4,9,3,7};
        int n = arr.length;
        int temp;
        for(int i=1; i<n; i++){
            temp = arr[i];
            for(int j=i-1; j>=0; j--){
                   if(arr[j]>=temp){
                    arr[j+1]=arr[j];
                }else{
                    arr[j+1]=temp;
                    break;
            }
             }
            }

            for(int i=0; i<n; i++){
                System.out.print(arr[i]+"   ");
            }

        }

    }
    

