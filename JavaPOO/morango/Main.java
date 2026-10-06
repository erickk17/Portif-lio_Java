package JavaPOO.morango;

public class Main{

    public static void main(String[] args) {

        lampada lampada = new lampada();
        lampada.Cor = "Amarela";
        lampada.Marca = "Positivo";
        lampada.Modelo = "Yakuza";
        lampada.Tamanho = 67;
        lampada.Tipo = "led";
        lampada.Voltagem = 220;

        System.out.println("Cor - " + lampada.Cor);
        System.out.println("Marca - " + lampada.Marca);
        System.out.println("Modelo - " + lampada.Modelo);
        System.out.println("Tamanho - " + lampada.Tamanho);
        System.out.println("Tipo - " + lampada.Tipo);    
        System.out.println("Voltagem - " + lampada.Voltagem);

    }
}