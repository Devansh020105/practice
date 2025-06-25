public class Array {
    public static boolean sortedOrnot(int input[]){

        if(input.length<=1){
            return true;
        }

        int smallinput[] = new int[input.length-1];
        for (int i =1;i<input.length;i++){
            smallinput[i-1] = input[i];
        }

        boolean smallans = sortedOrnot(smallinput);
        if (!smallans){
            return false;
        }
        if (input[0] <= input[1]){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6 };
        System.out.println(sortedOrnot(arr));
    }
}
