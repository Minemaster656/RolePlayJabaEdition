public class Calcs {

}
class Calc extends Thread{
    @Override
    public void run() {
//        super.run();
        while (true){
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }}
    }
}
