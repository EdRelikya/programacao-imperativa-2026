import java.util.Random;

public class atvB {
    public static Random random = new Random();
    public static void main(String[] args) {

        int v[] = new int[5];


        for(int i = 0; i < v.length; i++){
            v[i] = random.nextInt(100);
        }

        
       ordenar(v);


       for(int i = 0; i < v.length; i++){
            System.out.println(v[i] + " ");
        }


    }
    public static void ordenar(int v[]){

        for(int i = 1; i < v.length - 1; i++  ){
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
                
            }
            v[j + 1] = chave;
        }
    }

}
