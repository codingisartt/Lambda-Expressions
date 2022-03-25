public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable() {// anonymous classes

            @Override
            public void run() {
                System.out.println("hello java!");                
            }
            
        });
        t1.start();

        Runnable r1=new Runnable() {

            @Override
            public void run() {
                System.out.println("Runnable class");
                
            }
            
        };
        r1.run();

        new Runnable() {

            @Override
            public void run() {
                System.out.println("Runnable class 2");
                
            }
            
        }.run();

        //Runnable r2=() -> System.out.println("r2 class");
        Runnable r2=() -> {
            System.out.println("r2 class");
        };
        r2.run();

        
    }
}