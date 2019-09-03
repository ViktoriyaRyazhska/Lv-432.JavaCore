import java.io.*;

public class Practice {
    public static void main(String[] args) {
        new Task1();
        new Task2();
        //new Task3();
    }
}

class Task1{
    Task1(){
        System.out.println("Task 1");
        Runnable runnable = new MyRunnableTask1();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task2{
    Task2() {
        System.out.println("Task 2");
        Runnable runnable1 = new MyRunnableTask2("Hello, world!", 2000);
        Runnable runnable2 = new MyRunnableTask2("Peace int the peace", 3000);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}

class Task3{
    Task3(){
        System.out.println("Task 3");
        FileReader fileReader;
        BufferedReader reader;
        String[] text = new String[7];
        try {
            fileReader = new FileReader("D:\\GitWork\\Lv-432.JavaCore\\HW9\\src\\mytext.txt");
            reader = new BufferedReader(fileReader);

            for (int i = 0; i < text.length; i++) {
                text[i] = reader.readLine();
                System.out.println((i+1)+"   "+text[i]);
            }

            countSymbols(text);

            System.out.println("The longest and the shortest row");
            longestLine(text);
            shortestLine(text);

            consistWord(text);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void countSymbols(String[] strings){
        int i = 0;
        for (String s : strings) {
            System.out.println((++i)+" row has "+s.length()+" symbols");
        }
    }

    private void longestLine(String[] strings){
        String s = strings[0];
        for (String item : strings){
            if (s.length() < item.length()){
                s = item;
            }
        }
        System.out.println(s);
    }

    private void shortestLine(String[] strings){
        String s = strings[0];
        for (String item : strings){
            if (s.length() > item.length()){
                s = item;
            }
        }
        System.out.println(s);
    }

    private void consistWord(String[] strings){
        int i = 0;
        for (String s : strings){
            if (s.contains("var")){
                System.out.println((++i)+" row contains \"var\"");
            }
        }
    }
}

class MyRunnableTask1 implements Runnable{

    @Override
    public void run() {
        System.out.println("I study Java");
    }
}

class MyRunnableTask2 implements Runnable{

    private String message;
    private int millis;

    MyRunnableTask2(String message, int millis) {
        this.message = message;
        this.millis = millis;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);

            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("My name is "+Thread.currentThread().getName());
    }
}
