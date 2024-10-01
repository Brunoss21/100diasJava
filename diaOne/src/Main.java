public class Main {
    public static void main(String[] args) {
       
        uzumaki naruto = new uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.getNome();
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.idade = 16;
        naruto.ataqueBase();


        uchiha sasuke = new uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.getNome();
        System.out.println("Meu nome é: " + sasuke.getNome());
        sasuke.sharinganAtivado();
        sasuke.ataqueBase();
        sasuke.ataqueBase(5);
    }
    
}
