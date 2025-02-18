package estudos.java.introducao;

public class ExercicioFor {
    public static void main(String[] args) {
        double valorCarro = 30000;

        for(int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valoresParcelas = valorCarro / parcela;

            if(valoresParcelas < 1000){
                continue;
            }

            System.out.println(parcela + " parcela(s) de R$" + valoresParcelas);
        }
    }
}
