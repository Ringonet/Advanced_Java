package Lesson033;

//interface Executable {
//    void execute();
//}
//
//class Runner {
//    public void run(Executable e) {
//        e.execute();
//    }
//}
//
//class ExecutableImplementation implements Executable {
//
//    @Override
//    public void execute() {
//        System.out.println("Hello");
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Runner runner = new Runner();
//        runner.run(new ExecutableImplementation());
//        runner.run(new Executable() {
//            @Override
//            public void execute() {
//                System.out.println("Hello");
//            }
//        });
//        runner.run(() -> System.out.println("Hello"));
//    }
//}

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}

public class Test {
    public static void main(String[] args) {
        Runner runner = new Runner();

        int a = 1;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {
                int a = 1;
                return x + y;
            }
        });
        runner.run((x, y) -> x + y);


    }
}