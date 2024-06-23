public class ReverseOFStr {
public static void main(String[] args) {
    String s = "malayalam";
    String rev = "";
    int n = s.length();
    for(int i = 0; i < n; i++){
//        System.out.print(s.charAt(n - i - 1));
        rev += s.charAt(n-i-1);

    }
    System.out.println(rev+" "+s);

    String con = s.equals(rev) ? s+" is palindrome" : s+ " is not palindrome";
    System.out.println(con+" ");













//    if(s == ans){
//        System.out.println("true");
//    }
//    else{
//        System.out.println("false");
//    }

}
}
