package projet;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CLIClassiqueTest {

    @Test
    public void testConfiguration() {
        String[] args = {"-K", "10", "-A", ".90", "-K", "20", "-P", "-K", "30", "-C"};
        Configuration config = CLIClassique.configuration(args);
        assertEquals("alpha=0.9, epsilon=-1.0, indice=30, mode=CREUSE", config.toString());
    }

}