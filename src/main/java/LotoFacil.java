public class LotoFacil implements Jogo{
    @Override
    public String gerarResultado() {
        String resultado = "";
        Sorteio sorteio = new Sorteio(60);
        for (int i = 0 ; i<15;i++){
            resultado+=sorteio.sortear()+",";
        }
        return resultado;
    }
}
