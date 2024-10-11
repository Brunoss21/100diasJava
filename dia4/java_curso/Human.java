package java_curso;

public class Human extends SerVivo {

    public Human(){
        super(42);
    }

    @Override
    public void respirar() {
        // TODO Auto-generated method stub
        System.out.println(this.idade);
        System.out.println("Inalando e Expirando CO2 e Oxigenio");
        
    }


}
