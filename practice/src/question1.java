public class question1 {
    public static void main(String[] args) {
        int[] arr = {2,7,9,11};
        int target =9;
        int[] arr1 = new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.print(i +" "+ j);
                }
            }
        }
    }
}
