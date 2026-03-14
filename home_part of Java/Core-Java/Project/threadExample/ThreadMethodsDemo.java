
package com.abc.myfirstproject.threadExample;


// Example class extending Thread
class WorkerThread extends Thread {

    public WorkerThread(String name) {
        super(name); // Set thread name at creation
    }

    @Override
    public void run() {
        System.out.println(getName() + " started running.");

        // Loop to simulate some work
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " → Step " + i);

            try {
                // Pause the thread for 500ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // If interrupted while sleeping, handle it here
                System.out.println(getName() + " was interrupted!");
                return; // Exit thread gracefully
            }

            // Yield = give other threads a chance
            Thread.yield();
        }

        System.out.println(getName() + " finished.");
    }
}

public class ThreadMethodsDemo {
    public static void main(String[] args) throws InterruptedException {
        // Create two worker threads
        WorkerThread t1 = new WorkerThread("Worker-1");
        WorkerThread t2 = new WorkerThread("Worker-2");

        // Set different priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority = 1 (lowest)
        t2.setPriority(Thread.MAX_PRIORITY);  // Priority = 10 (highest)

        // Start both threads (creates new call stacks)
        t1.start();
        t2.start();

        // MAIN THREAD is also running in parallel here
        System.out.println("Main thread is running: " + Thread.currentThread().getName());

        // Check if threads are alive after starting
        System.out.println("Is Worker-1 alive? " + t1.isAlive());
        System.out.println("Is Worker-2 alive? " + t2.isAlive());

        // Wait until Worker-1 finishes (join blocks the main thread)
        t1.join();
        System.out.println("Worker-1 has completed, now main can continue.");

        // Give Worker-2 some time to run
        Thread.sleep(1000);

        // Interrupt Worker-2 (if it's still running)
        if (t2.isAlive()) {
            System.out.println("Interrupting Worker-2...");
            t2.interrupt();
        }

        // Print current running thread (should be main here)
        System.out.println("Currently executing thread: " + Thread.currentThread().getName());

        // Wait until Worker-2 finishes too
        t2.join();

        System.out.println("All threads finished. Main exits.");
    }
}

