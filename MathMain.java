public class MathMain {
    public static void main(String[] args) {
        Matematik toplama=new Matematik() {

            @Override
            public int transection(int a, int b) {
                // TODO Auto-generated method stub
                return a+b;
            }
            
        };
        Matematik cikarma=new Matematik() {

            @Override
            public int transection(int a, int b) {
                return a-b;
            }
            
        };
        Matematik carpma=new Matematik() {

            @Override
            public int transection(int a, int b) {
                return a*b;
            }
            
        };
        Matematik bolme=new Matematik() {

            @Override
            public int transection(int a, int b) {
                if(b==0){
                    b=1;
                }
                return a/b;
            }
            
        };
        System.out.println(toplama.transection(10, 2));


        System.out.println("-----With Lambda-----");

        Matematik topla=(a, b) -> a+b;
        Matematik cikar=(a, b) -> a-b;
        Matematik carp=(a, b) -> a*b;
        Matematik bol=(a, b) -> {
            if(b==0){
                b=1;
            }
            return a/b;
        };
        System.out.println(topla.transection(10, 2));
        System.out.println(cikar.transection(10, 2));
        System.out.println(carp.transection(10, 2));
        System.out.println(bol.transection(10, 2));
    }
}
