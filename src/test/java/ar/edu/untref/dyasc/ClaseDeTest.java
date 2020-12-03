package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class ClaseDeTest {

    @Test
    public void unTestBasico() {

        Clase clase = new Clase();

        String hiceAlgo = clase.hacerAlgo();

        assertThat(hiceAlgo).isEqualTo("Hago algo!");

    }

}
