public class Federal implements Jogo{
    @Override
    public String gerarResultado() {
        Sorteio sorteio1,sorteio2,sorteio3,sorteio4 ;
        sorteio1 = new Sorteio(9);
        sorteio2 = new Sorteio(9);
        sorteio3 = new Sorteio(9);
        sorteio4 = new Sorteio(9);

        return ""+sorteio1.sortear()+""+sorteio2.sortear()+""+sorteio3.sortear()+""+sorteio4.sortear();
    }
}
