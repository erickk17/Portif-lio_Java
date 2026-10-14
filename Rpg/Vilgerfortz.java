package Rpg;

  public class Vilgerfortz extends vinland {

    int Vida = 150;
    int Stamina = 800;
    int Dano = 86; //por hit
    int DanoRecebido = 60;
    int Nivel = 90;

    public Vilgerfortz(int danoP, int staminaP, int vidaP, int nivelP, int danoR) {
        this.Dano = danoP;
        this.Stamina = staminaP;
        this.Vida = vidaP;
        this.Nivel = nivelP;
        this.DanoRecebido = danoR;
    }
        void verificarVida (){
         if (Vida <= 0){
            System.out.println("foi morto em combate aperte, Space para renascer");
         }else if (Vida <= 75){
            System.out.println("Voce esta morrendo usa E para curar");
            }
         else{
             System.out.println("ainda esta vivo");
            }
        }

     @Override 
      void atacar(){
        System.out.println("projeção magica (cajado)");
   }      
        public int getDanoRecebido(){
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

    public void setNivel(int nivelP) {
      Nivel = nivelP;
    }
 }