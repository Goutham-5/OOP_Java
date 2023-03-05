
class TaskExecute extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            // System.out.println("Task Executing");
            System.out.println("Printer 1");
        }
    }
}
public class Thread3 {
    public static void main(String args[]) {
        System.out.println("STARTED");
        TaskExecute t = new TaskExecute();
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Printer 2");

        }
        System.out.println("FINISHED");
    }
}