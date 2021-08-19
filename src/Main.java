public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder x = new StringBuilder("123321");

        StringBuilder z = reverse(x);

        System.out.println(z.equals(x));


    }

    public static StringBuilder reverse(StringBuilder n){
        return n.reverse();
    }

    public static boolean isPalindrome(StringBuilder x, StringBuilder n){
        if(reverse(n).equals(x)){
            return true;
        }
        else
            return false;
    }

}
