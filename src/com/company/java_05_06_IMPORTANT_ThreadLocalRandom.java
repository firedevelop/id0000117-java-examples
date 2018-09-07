import java.util.concurrent.ThreadLocalRandom;

public class java_05_06_IMPORTANT_ThreadLocalRandom {
    public static void main(String[]args){
        for(int i=0; i<10; i++){
            // gracias al +1 del final, el numero 5 está incluido en el rango indicado, del 1 al 5
            int num = ThreadLocalRandom.current().nextInt(1,5+1);
            System.out.println(num);
        }}}
