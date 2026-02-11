package multithreading.printshop;

class PrintJob implements Runnable {

    private String jobName;
    private int pages;
    private int priority;

    // Shared printer (only one printer available)
    private static final Object printer = new Object();

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    @Override
    public void run() {

        synchronized (printer) {   // Only one job prints at a time

            long startTime = System.currentTimeMillis();

            System.out.println("Starting " + jobName +
                    " | Pages: " + pages +
                    " | Priority: " + priority);

            try {
                for (int i = 1; i <= pages; i++) {

                    System.out.println("[" + getPriorityLabel() + "] Printing "
                            + jobName + " - Page "
                            + i + " of " + pages);

                    Thread.sleep(100);  // 100ms per page
                }

            } catch (InterruptedException e) {
                System.out.println(jobName + " interrupted.");
            }

            long endTime = System.currentTimeMillis();

            System.out.println(jobName + " completed in "
                    + (endTime - startTime) + " ms\n");
        }
    }

    private String getPriorityLabel() {
        if (priority >= 7) return "High Priority";
        else if (priority >= 5) return "Medium Priority";
        else return "Low Priority";
    }
}
