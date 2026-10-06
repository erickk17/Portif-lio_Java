package Metodos;

public class main {
    
    public static void main (String[] args) {
        
      luffy luffy = new luffy();
      luffy.nome = "luffy";
      luffy.recompensa = 30000000000L;
      luffy.tesouro = "Thousand_Sunny";
      luffy.sonho = "ReiDaPirataria";


      zoro zoro = new zoro();
      zoro.nome = "zoro";
      zoro.recompensa = 1100000000L;
      zoro.tesouro = "Wado Ichimonji";
      zoro.sonho = "ter a maior espada";


      sanji sanji = new sanji();
      sanji.nome = "sanji";
      sanji.recompensa = 1032000000L;
      sanji.tesouro = "faca de cozinha";
      sanji.sonho = "Ter o coração da Nami";

      Boa Boa = new Boa();
      Boa.nome = "Boa";
      Boa.recompensa = 1692000000L;
      Boa.tesouro = "Monkey.D luffy";
      Boa.sonho = "Se Casar com luffy";

      System.out.println("Nome: " + luffy.nome);

      System.out.println("\n ---polimorfismo--- ");
      
      luffy.atacar();
      Boa.atacar();
    
      




    }
}
