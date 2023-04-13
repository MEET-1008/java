public class p21_print_thread {
    public static void main(String[] args) {
        
        new PrintAThread().start();
        new PrintBThread().start();
        new PrintNumberThread().start();
    }
    
    private static class PrintAThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.print("a");
            }
        }
    }
    
    private static class PrintBThread extends Thread {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.print("b");
            }
        }
    }
    
    private static class PrintNumberThread extends Thread {
        public void run() {
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
