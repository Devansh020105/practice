public class removeDuplicate {
    public static String RemoveDuplicate(String str){
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return RemoveDuplicate(str.substring(1));
        }
        return str.charAt(0) + RemoveDuplicate(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "xxxxhsjfkaebkzasa";
        System.out.println(RemoveDuplicate(str));
    }
}
