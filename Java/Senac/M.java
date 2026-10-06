public class main {
    public static void main(String[] args) {

        int totalSegundos;

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600);
        int segundos = totalSegundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        entrada.close();
    }