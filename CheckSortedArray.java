

public class CheckSortedArray {

    public static boolean checkArray(int arr[], int idx ){
        if(idx == arr.length-1){
            return true;
        }
        
          if(!checkArray(arr, idx +1 )){
            return false;
          }
        return arr[idx] <arr[idx +1];
    }
    public static void main(){
        int array[] ={1,2,3,14,5};
        if(checkArray(array,0)){
            System.out.println("Yes! it is stringly sorted!");
        }else{
            System.out.println("No! It is not increasing order");
        }
    }   
}
