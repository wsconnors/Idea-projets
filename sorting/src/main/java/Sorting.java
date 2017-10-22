

public class Sorting {

    public String convertArrayToString(int[] array) {
        String output = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                output += array[i];
            } else {
                output += "\n" + array[i];
            }
        }
        return output;
    }


    public int[] bubbleSort(int[] array) {
        int temp;
        for (int j = 1; j <= array.length - 1; j++) {
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        return array;
    }

    public int[] lowToHi(int[] array) {
        int min, minLoc, temp;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            minLoc = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minLoc = j;
                }
            }
            temp = array[i];
            array[i] = min;
            array[minLoc] = temp;
        }

        return array;
    }

}
