public class ReverseOFStr {
public static void main(String[] args) {
    String s = "malayalam";
    String ans = "";
    int n = s.length();
    for(int i = 0; i < n; i++){
//        System.out.print(s.charAt(n - i - 1));
        ans += s.charAt(n-i-1);
    }
    System.out.println(ans+" "+s);
    System.out.println(s.equals(ans));
//    if(s == ans){
//        System.out.println("true");
//    }
//    else{
//        System.out.println("false");
//    }

}
}
