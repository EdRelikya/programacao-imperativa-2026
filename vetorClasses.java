import java.util.Scanner;

class Produtos{
    String nome;
    double valor;
    int quantidade;
}

public class vetorClasses {
public static Scanner sc = new Scanner(System.in);
public static final int TAM = 3;
 public static void main(String[] args) {

    Produtos[] produtos = new Produtos[TAM];

    preencherProdutos(produtos);
    imprimirProdutos(produtos);
    imprimirMaiorValorProduto(produtos);

    
 }

 public static void preencherProduto(Produtos p){
    System.out.println("Nome produto: ");
    p.nome = sc.nextLine();
    System.out.println("Valor produto: ");
    p.valor = sc.nextDouble();
    System.out.println("Unidades: ");
    p.quantidade = sc.nextInt();
    sc.nextLine();
 }

public static void preencherProdutos(Produtos[] vp){
    for(int i = 0; i < vp.length; i++){
        vp[i] = new Produtos();
        preencherProduto(vp[i]);
    }



 }

 public static void imprimirProduto(Produtos p){
    System.out.printf("[%s, R$ %.2f, %d Unidades]",
     p.nome, p.valor, p.quantidade);
   
 }

 public static void imprimirProdutos(Produtos[] vp){
   for(int i = 0; i < vp.length; i++){
     vp[i] = new Produtos();
     imprimirProduto(vp[i]);
  }
 }

 public static void imprimirMaiorValorProduto(Produtos[] mp)
 {
    double maiorValor = 0;


    for(int i = 0; i < mp.length; i++){
        if (mp[i].valor > maiorValor) {
            maiorValor = mp[i].valor;
        }
    }
    System.out.println("Produto com maior valor: " + maiorValor);
 }
}



