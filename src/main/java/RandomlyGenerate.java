import java.util.Arrays;

public class RandomlyGenerate {
    public void fillArray(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            numbers[x] = (int) (Math.random() * 20) + 1;
        }
    }

    public void bubble(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            // Aquí "y" se detiene antes de llegar a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < numbers.length - 1; y++) {
                int elementoActual = numbers[y];
                int elementoSiguiente = numbers[y + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    numbers[y] = elementoSiguiente;
                    numbers[y + 1] = elementoActual;
                }
            }
        }
    }

    public void bubbleMethod(int[] numbers) {
        fillArray(numbers);
        bubble(numbers);
        System.out.println("Método burbuja: " + Arrays.toString(numbers));
    }

    public void quickSort(int[] numbers, int low, int high) {
        int i;
        int j;
        int temp, t;

        if (low > high) {
            return;
        }

        i = low;
        j = high;
        // temp es la referencia
        temp = numbers[low];

        while (i < j) {
            // Desde la derecha primero, luego disminuya hacia la izquierda
            while (temp <= numbers[j] && i < j) {
                j--;
            }
            // Desde la izquierda, aumentar a la derecha
            while (temp >= numbers[i] && i < j) {
                i++;
            }
            // Intercambiar si se cumplen las condiciones
            if (i < j) {
                t = numbers[j];
                numbers[j] = numbers[i];
                numbers[i] = t;
            }

        }
        // Finalmente, intercambie la referencia a los números iguales a i y j
        numbers[low] = numbers[i];
        numbers[i] = temp;
        // Llama recursivamente a la media matriz izquierda
        quickSort(numbers, low, j - 1);
        // Llama recursivamente a la media matriz derecha
        quickSort(numbers, j + 1, high);
    }

    public void quickSortMethod(int[] numbers) {
        fillArray(numbers);
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println ("Método Quick Sort: " + Arrays.toString (numbers));
        }
    }

