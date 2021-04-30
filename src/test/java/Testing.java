import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class Testing {
    @Test
    void testBanana() {
        BWT a = new BWT("banana");
        a.permutations();
        assertEquals("nnbaaa", a.getTransform());
        assertEquals("banana", a.decode());
    }

    @Test
    void testAbracadabra() {
        BWT a = new BWT("abracadabra");
        a.permutations();
        assertEquals("rdarcaaaabb", a.getTransform());
        assertEquals("abracadabra", a.decode());
    }

    @Test
    void testYokohama() {
        BWT a = new BWT("yokohama");
        a.permutations();
        assertEquals("hmooakya", a.getTransform());
        assertEquals("yokohama", a.decode());
    }

    @Test
    void testAardvark() {
        BWT a = new BWT("aardvark");
        a.permutations();
        assertEquals("kavrraad", a.getTransform());
        assertEquals("aardvark", a.decode());
    }

    @Test
    void testUnicorns() {
        String s = "the unicorns eating the unicorns";
        s = s.replace(" ", "");
        BWT a = new BWT(s);
        a.permutations();
        assertEquals("eiishhnttnntiuurrccoonnsgaee", a.getTransform());
        assertEquals(s, a.decode());
    }

    @Test
    void testVN() {
        String s = "what I present here is what I remember of the letter " +
                "and what I remember of the letter I remember verbatim";
        s = s.replace(" ", "");
        BWT a = new BWT(s);
        a.permutations();
        assertEquals("tttrrhhhbrmmmnrhhmmmrrrsttvhbbbrlloowwwtttteeeeeeeeeiaerrIeeeeIIIpeeeeiaaattffnaeermds",
                a.getTransform());
        assertEquals(s, a.decode());
    }

    @Test
    void testSingleChar()  {
        String s = "a";
        s = s.replace(" ", "a");
        BWT a = new BWT(s);
        a.permutations();
        assertEquals("a",
                a.getTransform());
        assertEquals(s, a.decode());
    }

    @Test
    void testInvalidLength()  {
        String s = "";
        BWT a = new BWT(s);
        assertEquals("invalid length",
                a.getTransform());
    }

    @Test
    void testNull()  {
        String s = "";
        BWT a = new BWT(s);
        assertEquals("invalid length",
                a.getTransform());
    }
}
