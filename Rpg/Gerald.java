package Rpg;
 
    public class Gerald extends vinland {

    int DanoRecebido = 86;
    int Vida = 350;
    int Stamina = 1400;
    int Dano = 60; //por hit
    int Nivel = 109;

    public Gerald(int danoP, int staminaP, int vidaP, int nivelP, int danoR){
        this.Dano = danoP;
        this.Stamina = staminaP;
        this.Vida = vidaP;
        this.Nivel = nivelP;
        this.DanoRecebido = danoR;
    }
    
        void verificarVida (){
            if (Vida <= 0){
                System.out.println("Geraldão foi morto e nao sobra nada");
            }else if (Vida <= 150){
                System.out.println("Voce esta morrendo usa E para curar");
                }
            else{
                System.out.println("Geraldão ainda vivo");
            }
        }

    @Override 
    void atacar(){
        System.out.println("Whirl (espada)");
    }

     public int getDanoRecebido() {
         return DanoRecebido;
     }

     public void setDanoRecebido(int danoRecebido) {
         DanoRecebido = danoRecebido;
     }

     public int getVida() {
         return Vida;
     }

     public void setVida(int vida) {
         Vida = vida;
     }

     public int getStamina() {
         return Stamina;
     }

     public void setStamina(int stamina) {
         Stamina = stamina;
     }

     public int getDano() {
         return Dano;
     }

     public void setDano(int dano) {
         Dano = dano;
     }

     public int getNivel() {
         return Nivel;
    }

     public void setNivel(int nivel) {
         Nivel = nivel;
    }
    
}

