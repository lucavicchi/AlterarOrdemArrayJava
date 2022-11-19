import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[100];
        int qnt=0;
        int valorInserido;

        System.out.println("Digite os numeros do array: ");
        for (int i = 0; i < numeros.length; i++) {
            valorInserido = scanner.nextInt();
            if(valorInserido == 0) break;
            numeros[i] = valorInserido;
            qnt++;
        }

        inverterArrayMetodo1(numeros,qnt);
//        inverterArrayMetodo2(numeros, qnt);

        for (int i = 0; i < qnt; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static int[] inverterArrayMetodo1(int[] array, int qnt){
        for (int i = 0; i < qnt/2; i++) {
            array[i] = array[i] ^ array[qnt-i-1] ^ (array[qnt-i-1] = array[i]);
        }
        return array;
    }

    public static int[] inverterArrayMetodo2(int[] array, int qnt){
        int aux;
        for (int i = 0; i < qnt/2; i++) {
            aux = array[i];
            array[i] = array[qnt-i-1];
            array[qnt-1-i] = aux;
        }
        return array;
    }
}
