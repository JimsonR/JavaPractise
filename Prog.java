public class Prog {

    public static void main(String[] args) {
        String s = "xyz";

        System.out.println('x'+1);
        for(int i=0; i<=s.length()-1; i++){
            char d = s.charAt(i);
            if (d+1<123) {
                System.out.print((char) (d + 1));
            }
            else{

                System.out.print((char)(d - 25));
            }

        }
    }
}
