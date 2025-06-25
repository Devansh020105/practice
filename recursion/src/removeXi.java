public class removeXi {
    public static String RemoveX(String input ){

        if(input.length()==0){
            return input;
        }
        String ans = "";
        if(input.charAt(0)!='x'){
            ans = ans+input.charAt(0);
        }
        String smallAns = RemoveX(input.substring(1));
        return ans+smallAns;
    }
    public static void main(String[] args) {
        String input = "xxsfsexaxx";
        String Answer = RemoveX(input);
        System.out.println(Answer);
    }
}
