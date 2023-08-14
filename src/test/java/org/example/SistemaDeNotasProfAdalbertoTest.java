package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class NotaEscolaTest {

    @Test
    public void testArredondaNota() {
        assertEquals(85, NotaEscola.arredondaNota(84));
        assertEquals(29, NotaEscola.arredondaNota(29));
        assertEquals(57, NotaEscola.arredondaNota(57));
        assertEquals(75, NotaEscola.arredondaNota(73));
        assertEquals(91, NotaEscola.arredondaNota(91));
        assertEquals(37, NotaEscola.arredondaNota(37));
        assertEquals(100, NotaEscola.arredondaNota(99)); 
    }
}
