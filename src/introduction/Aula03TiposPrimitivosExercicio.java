package introduction;
/*
Prática
Crie variáveis para os campos descrito abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
* */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "João";
        String endereco = "São Gabriel 2554";
        double salario = 2000;
        String data = "05/03/2025";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+data);
    }
}
