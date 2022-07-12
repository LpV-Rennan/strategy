import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    static private Random sorteador = new Random();

    private ArrayList<Integer> bolasNoGlobo;

    public Sorteio(int numeroDeBolas){
        bolasNoGlobo = new ArrayList<>();
        for(int i = 1 ; i <= numeroDeBolas; i++){
            bolasNoGlobo.add(i);
        }
    }

    public int sortear(){
        if (bolasNoGlobo.isEmpty()){
            throw new RuntimeException("O globo está vazio");
        }
        int posicao = sorteador.nextInt(bolasNoGlobo.size()-1);
        int bola = bolasNoGlobo.get(posicao);
        bolasNoGlobo.remove(posicao);
        return bola;
    }
}
