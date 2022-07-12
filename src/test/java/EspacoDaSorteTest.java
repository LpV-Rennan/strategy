import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class EspacoDaSorteTest {
    Federal federal;
    LotoFacil lotoFacil;
    MegaSena megaSena;
    Milionaria milionaria;
    Quina quina;

    @BeforeEach
    public void setUp(){
        federal = Mockito.mock(Federal.class);
        lotoFacil = Mockito.mock(LotoFacil.class);
        megaSena = Mockito.mock(MegaSena.class);
        milionaria = Mockito.mock(Milionaria.class);
        quina = Mockito.mock(Quina.class);

        when(federal.gerarResultado()).thenReturn("1234");
        when(lotoFacil.gerarResultado()).thenReturn("01,02,05,07,09,10,11,12,14,15,16,18,20,22,25");
        when(megaSena.gerarResultado()).thenReturn("11,19,38,47,56,59");
        when(milionaria.gerarResultado()).thenReturn("12,47,35,44,48,09 ; trevos 5,1");
        when(quina.gerarResultado()).thenReturn("12,14,09,04,30");
    }
    @Test
    void deveRetornarResultadoDaFederal(){
     EspacoDaSorte espacoDaSorte = new EspacoDaSorte();
     Assertions.assertEquals("1234", espacoDaSorte.gerarResultado(federal));
    }

    @Test
    void deveRetornarResultadoDaLotoFacil(){
        EspacoDaSorte espacoDaSorte = new EspacoDaSorte();
        Assertions.assertEquals("01,02,05,07,09,10,11,12,14,15,16,18,20,22,25", espacoDaSorte.gerarResultado(lotoFacil));
    }

    @Test
    void deveRetornarResultadoDaMegaSena(){
        EspacoDaSorte espacoDaSorte = new EspacoDaSorte();
        Assertions.assertEquals("11,19,38,47,56,59", espacoDaSorte.gerarResultado(megaSena));
    }

    @Test
    void deveRetornarResultadoDaMilionaria(){
        EspacoDaSorte espacoDaSorte = new EspacoDaSorte();
        Assertions.assertEquals("12,47,35,44,48,09 ; trevos 5,1", espacoDaSorte.gerarResultado(milionaria));
    }
    @Test
    void deveRetornarResultadoDaQuina(){
        EspacoDaSorte espacoDaSorte = new EspacoDaSorte();
        Assertions.assertEquals("12,14,09,04,30", espacoDaSorte.gerarResultado(quina));
    }



}