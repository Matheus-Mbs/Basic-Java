package estudos.java.introducao;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class TiposPrimitivosExerc {
    public static void main(String[] args) {
        String name = "Matheus";
        String adress = "Morada Nova";
        double salary = 2200.50;
        String data = "29/01/2025";

        String message = String.format("Eu %s, morando no endereço %s, confirmo que recebi o salário de %.2f, na data %s.",name,adress,salary,data);

        System.out.println(message);
    }
}
