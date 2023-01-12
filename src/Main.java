import java.lang.ref.WeakReference;
import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");
        Object object = new Object();
        System.out.println("\n Сильная ссылка на объект: " + object);

        WeakReference<Object> weakreference =
                new WeakReference<>(object);
        object = null;
        System.out.println("\n Сильная ссылка на объект " + object + " после его зануления: " + weakreference.get());

        System.out.println("\n Слабая ссылка на удаленный" + " объект: " + weakreference);

        System.gc();

        System.out.println(" \n Слабая ссылка на удаленный " + object + " объект после вызова сборщика мусора: " + weakreference.get());

    }
}