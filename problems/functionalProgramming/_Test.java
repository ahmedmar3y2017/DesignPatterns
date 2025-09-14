package problems.functionalProgramming;

public class _Test {

    @FunctionalInterface
    public interface Greeting {
        void sayHello(String name);
    }

    @FunctionalInterface
    public interface helperInterface{
        int sum(int num1 , int num2);
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);

            }
        };

        // using lambda
        Greeting greeting2 = name -> {
            System.out.println("Hello " + name);
        };

        greeting2.sayHello("World") ;
        greeting.sayHello("World") ;


        helperInterface h = (num1, num2) -> num1 + num2;
        System.out.println(h.sum(2,3));
    }
}
