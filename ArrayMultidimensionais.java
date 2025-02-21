package estudos.java.introducao;

public class ArrayMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayRef = new int[3][];

        arrayRef[0] = new int[]{1,2,3};
        arrayRef[1] = new int[]{1,2,3,4,5,6};
        arrayRef[2] = new int[]{1,2,3,4,5,6,7,8,9};

        for (int[] arrayBase : arrayRef){
            for (int i = 0; i < arrayBase.length; i++) {
                System.out.println(arrayBase[i]);
            }
            System.out.println("------------------------");
        }
    }
}
