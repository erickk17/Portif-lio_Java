import java.util.ArrayList;
import java.util.List;
 
public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>(5);
        notas.add(8);
        notas.add(7);
        
        int nota = notas.get(1);
        int valor = nota ;

        System.out.println(valor +  nota);

}
