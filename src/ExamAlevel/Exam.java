package ExamAlevel;

public class Exam {
    public static void main(String[] args) {
        // Найти количество различных элементов массива. Пример: для 1 4 5 1 1 3 ответ 4. *

        int [] array = {1, 2, 3, 4, 5, 1, 2, 3, 6, 7};
      int unique = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
             for (int j = 0; j < array.length; j++) {
                 if (array[i] == array [j])
                     count += 1;
             }
             if (count == 1)
                 unique += 1;
         }
        System.out.println("Number of unique elements in array is: " + unique);
    }
}
