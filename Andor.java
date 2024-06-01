public class Andor {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if ((--a==10)|(b++==20)){
            System.out.println("a:"+a+" "+"b:"+b);
        }
        int c = 10;
        int d = 10;
        if ((--c==10)||(c++==20)){
            System.out.println("c:"+c+" "+"d:"+d);
        }
    }
}
