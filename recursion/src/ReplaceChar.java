public class ReplaceChar {
    public static String Replace (String input, char C1, char C2 ){
        if(input.length()==0){
            return input;
        }
        String ans = "";
        if(input.charAt(0)!=C1){
            ans = ans+input.charAt(0);
        }
        else {
            ans =ans+C2;
        }
        String SmallAns = Replace(input.substring(1),C1,C2);
        return ans+SmallAns;
    }
    public static void main(String[] args) {
        String input = "ahcbueabj";
        char C1 = 'a';
        char C2 = 'o';
        System.out.println(Replace(input,C1,C2));
    }
}
