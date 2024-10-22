package pkg1;
class MultitTreadingOne extends Thread{
    public void run(){
        try{
            System.out.println("Thead"+Thread.currentThread().getId()+ "is running");
        }
       catch (Exception e){
           System.out.println("Exception is caught");
          }
       }
}
public class MultiTreadingOne{
  public static void main(String[] args){
      for(int i=0;i<8;i++){
         MultitreadingOne mt1=new MultitreadingOne();
                 mt1.start();
      }
  }
}