import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotericaTest {
    @Test
    void deveRetornarResultadoDaFederal(){
     Loterica loterica = new Loterica();
     Assertions.assertEquals("1234", loterica.gerarResultado(new Federal()));
    }

    @Test
    void deveRetornarResultadoDaLotoFacil(){
        Loterica loterica = new Loterica();
        Assertions.assertEquals("01,02,05,07,09,10,11,12,14,15,16,18,20,22,25", loterica.gerarResultado(new LotoFacil()));
    }

    @Test
    void deveRetornarResultadoDaMegaSena(){
        Loterica loterica = new Loterica();
        Assertions.assertEquals("12,14,27,44,60,06", loterica.gerarResultado(new MegaSena()));
    }

    @Test
    void deveRetornarResultadoDaMilionaria(){
        Loterica loterica = new Loterica();
        Assertions.assertEquals("12,14,27,44,60,06 ; trevos 5,1", loterica.gerarResultado(new Milionaria()));
    }
    @Test
    void deveRetornarResultadoDaQuina(){
        Loterica loterica = new Loterica();
        Assertions.assertEquals("12,14,09,04,30", loterica.gerarResultado(new Quina()));
    }



}