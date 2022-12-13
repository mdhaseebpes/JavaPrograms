package Threads;

public class MyAnotherThread extends  Thread{

    @Override
    public void run() {
        //task for thread
        for(int i=10;i>=1;i--){
            System.out.println("value of i is " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){


            }

        }
    }

}
