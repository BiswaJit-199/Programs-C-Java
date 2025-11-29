class ThreadsEasy1 { public static void main(String[] args){ Thread t = new Thread(() -> { for(int i=0;i<5;i++) System.out.println("T:"+i); }); t.start(); System.out.println("Main done"); } }
