import java.util.Iterator;

public class ExampleClient {

    private Iterable<Object> collection;

    public void operateWithCollection() {
        Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj.toString());
            // some methods
        }
    }

}
