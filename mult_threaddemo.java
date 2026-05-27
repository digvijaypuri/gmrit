public class mult_threaddemo {
//WAP to demostrate multithreading in java. Write Comment in Every Line.
    // Create a class that extends the Thread class
    static class MyThread extends Thread {
        // Override the run method to define the thread's behavior
        @Override
        public void run() {
            // Print a message indicating that the thread is running
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        }
    }
    public static void main(String[] args) {
        // Create multiple threads by instantiating the MyThread class
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        
        // Start the threads to execute their run methods concurrently
        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
