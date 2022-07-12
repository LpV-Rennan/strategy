public class Milionaria implements Jogo {
    @Override
    public String gerarResultado() {
        String resultado = "";
        Sorteio sorteio = new Sorteio(60);
        Sorteio trevo = new Sorteio(60);

        for (int i = 0 ; i< 6 ; i++ ){
            resultado += sorteio.sortear()+", ";
        }
        resultado+="\nTrevos: ";
        resultado+=trevo.sortear()+", ";
        resultado+=trevo.sortear();
        return resultado;
    }
}
