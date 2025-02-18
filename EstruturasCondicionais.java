package estudos.java.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args){
        int age1 = 18;
        int age2 = 16;
        int age3 = 10;
        int minimumAge = 18;

        if(age1 >= minimumAge && age2 >= minimumAge && age3 >= minimumAge) {
            System.out.println("Todos estão liberados para consumir bebidas alcoolicas");
        } else {
            System.out.println("A bebida alcoolica nao esta liberada para todos");
        }

        if(age1 >= minimumAge || age2 >= minimumAge || age3 >= minimumAge) {
            System.out.println("Alguem pode consumir bebidas alcoolicas");
        } else {
            System.out.println("Ninguem pode consumir bebidas alcoolicas");
        }
    }
}
