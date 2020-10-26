import java.util.Iterator;

/**
 * @author Nikolay Sinitsin
 */
public class FizzBuzzIterable implements Iterable<String> {
    @Override
    public Iterator<String> iterator() {
        return new FizzBuzzIterator();
    }
}
