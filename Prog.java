public class Prog {

    public static void main(String[] args) {
        String s = "xyz";
        String result = "";
//        System.out.println('x'+1);
//        for(int i=0; i<=s.length()-1; i++){
//            char d = s.charAt(i);
//            if (d+1<123) {
//                System.out.print((char) (d + 1));
//            }
//            else{
//
//                System.out.print((char)(d - 25));
//            }
//
//        }

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a';
//            System.out.println(num);
            num = num+1;

            int val = num % 26;
            System.out.println(val);
//            val = val + 1;
            char ch = (char)val;
            result += (char)(ch+'a');


//            char nextchar = (char)(num+1+'a');
//            System.out.println((char)(val+'a'));
        }
        System.out.println(result);
    }
}
