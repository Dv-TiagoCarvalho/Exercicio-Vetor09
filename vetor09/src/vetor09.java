import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class vetor09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

       int [] vetor1 = new int[6];
       int [] vetor2 = new int[6];
        Set<Integer> intersecaoSet = new HashSet<>();

       System.out.println("Digite 6 numeros");

       for (int i = 0; i < vetor2.length; i++) {

        vetor1[i] = scanner.nextInt();  
        
       }

       System.out.println("Digite 6 numeros");

       for (int i = 0; i < vetor2.length; i++) {

        vetor2[i] = scanner.nextInt();
  
       }

      for (int num1 : vetor1) {

        for (int num2 : vetor2 ) {

        if ( num1 == num2) {

        intersecaoSet.add(num1);
            
        } 

        }    
      }

      int[] vetor3 = new int[intersecaoSet.size()];
      int index = 0;

      for (Integer num : intersecaoSet) {
          vetor3[index++] = num;
           }
           System.out.println("\nPrimeiro vetor: " + Arrays.toString(vetor1));
           System.out.println("Segundo vetor: " + Arrays.toString(vetor2));
           System.out.println("Interseção dos vetores: " + Arrays.toString(vetor3));
           scanner.close();

     }
    
}
