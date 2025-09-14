package problems.multiThreading.code;

import java.util.concurrent.*;

public class ThreadPool {

    static Runtime runtime = Runtime.getRuntime();

    public static class myThread extends Thread {
        int taskId;

        myThread(int id) {
            taskId = id;
        }

        @Override
        public void run() {

            // logic
            try {
                System.out.println("Thread " + taskId + " started");
                Thread.sleep(2000);
                synchronized (this) {
                    System.out.println("Thread " + taskId + " Waiting for task");
                    this.wait(1000);
                }
                System.out.println("Thread " + taskId + " finished");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            }

        }
    }

    public static void main(String[] args) {
        int availableProcessors = runtime.availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(availableProcessors);

        for (int i = 0; i < 5; i++) {

            executor.execute(new myThread(i));
        }

        try {
            if (!executor.awaitTermination(5000, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }


        System.out.println("------------------ executer interface ");
        // create Thread each time
        Executor executor1 = command -> System.out.println("Thread " + command + " finished");
        executor1.execute(() -> System.out.println("ahmed marey"));

        System.out.println("------------------ executer service interface ");

        ExecutorService service = Executors.newFixedThreadPool(2);
        // runnable without return result
        service.execute(() -> System.out.println("ahmed marey"));
        // callable with return result
        Future<String> submit = service.submit(() -> {

            return "ahmed mohamed";
        });

        try {
            System.out.println("Future Rresult : " +  (submit.isDone() ? submit.get() : "Sorry For that "));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("------------------ ThreadPoolExecutor interface ");
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        for (int i = 0; i < 5; i++) {
            executorService.execute(() -> {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("ahmed marey");
            });


        }
        System.out.println("Active Count : " + executorService.getActiveCount());
        System.out.println("getPoolSize Count : " + executorService.getPoolSize());
        System.out.println("getQueue Count : " + executorService.getQueue().size());

    }
}
