package belovna.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassA classA = new ClassA(1, 2);
        System.out.printf("a:%d b%d\n",  classA.getA(), classA.getB());
    }
}
