import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        boolean bool = false;

                                   
        int[] colecaoDeInteiros = {1,23,55,76,78};
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Bruno");
        nomes.add("Juliana");
        nomes.add("Esmirna");


       
        System.out.println(nomes.get(0));

        
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for(String nome : nomes){
            System.out.println(nome);

        }

        int contador = 0;
        while (contador < 10) {
            System.out.println(contador);
            contador++;
            
        }

        double resultado = 0.0;

        int resultadoInt = (int)resultado;

        
    }
}
