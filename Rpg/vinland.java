package Rpg;
/**
 * vinland
 */
public class vinland {

    private int Vida;
    private int Stamina;
    private String Arma;
    private int Dano;
    private int DanoRecebido;
    private int Nivel;

    public boolean estaVivo() {
        return Vida > 0;
    }
    public void DanoRecebido(){
        if (Dano <= 0)
            System.out.println("Dano invalido voce errou");
        }


    void atacar(){
        System.out.println("ataque generico");
    
    }
}
