import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int aleatory = (int) (Math.random() * 20) + 1;
        int[] numbers = new int[20];
        Scanner decisionPerson = new Scanner(System.in);
        RandomlyGenerate generate = new RandomlyGenerate();

        System.out.println("Cual opción quiere para ordenar el array: \n" +
                            "1. Algoritmo de la burbuja. \n" +
                            "2. Quick sort \n");
        Integer optionPerson = decisionPerson.nextInt();

        switch (optionPerson){
            case 1 -> {
                generate.bubbleMethod(numbers);
            }
            case 2 -> {
                generate.quickSortMethod(numbers);
            }
        }
    }
}
