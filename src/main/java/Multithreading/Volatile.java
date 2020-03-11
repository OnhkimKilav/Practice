package Multithreading;

public class Volatile {
    volatile static int i = 0;

    public static void main(String[] args) {
        new ThreadWrite().start();
        new ThreadRead().start();

    }

    static class ThreadWrite extends Thread{
        @Override
        public void run() {
            while(i < 5){
                System.out.println("increment i to" + (++i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class ThreadRead extends Thread{
        @Override
        public void run() {
            int localVar = i;
            while(localVar < 5){
                if(localVar != i){
                    System.out.println("new value of i is " + i);
                    localVar = i;
                }
            }
        }
    }

}
