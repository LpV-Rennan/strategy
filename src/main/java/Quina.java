public class Quina implements Jogo{
    @Override
    public String gerarResultado() {
        Sorteio sorteio = new Sorteio(60);
        String resultado = "";
        for (int i =0 ; i< 5 ; i++ ){
            resultado+= sorteio.sortear()+", ";
        }
        return resultado;
    }
}
