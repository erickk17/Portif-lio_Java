public class tempo {
    public static void tempo(String[] args) {

        int totalSegundos 60 ;

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600);
        int segundos = totalSegundos % 60;

        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);
}
}