package belovna.test;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ClassATest extends TestCase {
    ClassA classA;

    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();

        classA = Mockito.mock(ClassA.class);

        System.out.printf("ClassATest.setUp 9. classA:%s\n", classA.getClass().getName());
    }

    @Test
    @DisplayName("Test ClassA")
    public void testClassA01 () {
        Mockito.when(classA.getA()).thenReturn(5);

        System.out.printf("ClassATest.testClassA01 1. getA:%d\n", classA.getA());
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
}