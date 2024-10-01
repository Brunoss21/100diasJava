public class uchiha extends ninja{
    public void sharinganAtivado(){
        System.out.println("Sharingan Ativado");
    }
    
    @Override
    public void ataqueBase(){
        System.out.println("Eu sou um ninja e ataquei uma kunai do elemento fogo");
    }

    public void ataqueBase(int nivelDeChacra){
        
        if(nivelDeChacra > 2){
            System.out.println("Susano ativado");
        } else if (nivelDeChacra < 1){
            System.out.println("Eu so conseguir ativar o sharingan");
        } else{
            System.out.println("Eu não consegui ativar");
        }
    }


}
