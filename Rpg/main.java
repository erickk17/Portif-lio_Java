package Rpg;

public class main {
 
    public static void main(String[] args) {
        
        Gerald gerald = new Gerald(86, 1400, 350, 60, 109);
        System.out.println(" \n------- Menu ------\n ");
        System.out.println("\n-- Status do Gerald --\n ");
        System.out.println("dano do geraldão " + gerald.Dano);
        System.out.println("stamina do geraldin do pneu: " + gerald.Stamina);
        System.out.println("vida do geraldin do pneu restante: " + gerald.Vida);
        System.out.println("nivel do proprei do geraldin do pneu: " + gerald.Nivel);
        System.out.println("Dano recebido pelo vilgerfortz: " + gerald.DanoRecebido);

        System.out.println();
    

        Vilgerfortz vilgerfortz = new Vilgerfortz(150, 800, 86, 60, 90);
        System.out.println("\n-- Status do Vilgerfortz--\n ");
        System.out.println("dano recebido por Vilgerfortz " + vilgerfortz.DanoRecebido);
        System.out.println("stamina do Vilgerfortz " + vilgerfortz.Stamina);
        System.out.println("vida do Vilgerfortzrestante " + vilgerfortz.Vida);
        System.out.println("nivel do proprei do Vilgerfortz " + vilgerfortz.Nivel);
        System.out.println("dano do monstro do Vilgerfortz " + vilgerfortz.DanoRecebido);
    
        int vidaBatalha = vilgerfortz.getVida();
        if (vidaBatalha <= 0 ){
            vidaBatalha = 0;
            System.out.println("Vc tomou mais dano que a sua vida!!!");
        } 
}
}