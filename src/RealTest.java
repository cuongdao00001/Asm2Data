import java.util.Random;

public class RealTest {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Messager m1 = new Messager("m1");
        Messager m2 = new Messager("m2");
        m1.connect(m2);

        for (int i = 0; i < 30; ++ i) {
            if (random.nextInt(20) % 2 == 0) {
                m2.send(String.valueOf(i));
            } else m1.send(String.valueOf(i));
        }
        m1.receive();
        m2.receive();
        m1.printAll();
        m2.printAll();
    } 
}
