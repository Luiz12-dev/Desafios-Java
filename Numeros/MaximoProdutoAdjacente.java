package Numeros;

public class MaximoProdutoAdjacente {

    public int encontrarMaiorProduto(int[] arrayNumeros){
        

        int maiorProduto = arrayNumeros[0]* arrayNumeros[1];

        for(int i =0; i< arrayNumeros.length -1; i++){
            int produtoAtual = arrayNumeros[i]* arrayNumeros[i+1];

            if(produtoAtual > maiorProduto){
                maiorProduto = produtoAtual;
            }

            
        }
        System.out.println("Maior produto adjacente é: " + maiorProduto);
        
        return maiorProduto;
    }


    public int encontrarMenorProduto(int[] arrayNumeros){
        int menorProduto = arrayNumeros[0]* arrayNumeros[1];

        for(int i = 0; i<arrayNumeros.length - 1; i++){
            int produtoAtual = arrayNumeros[i]* arrayNumeros[i+1];

            if(menorProduto != 0 && produtoAtual < menorProduto){
                menorProduto = produtoAtual;
            }


        }
        System.out.println("Menor produto adjacente é: " + menorProduto);
        
        return menorProduto;
    }

    public static void main(String[] args) {
        MaximoProdutoAdjacente maximoProdutoAdjacente = new MaximoProdutoAdjacente();

        int[] arrayNumeros = {3, 6, -2, -5, 7, 3};

        maximoProdutoAdjacente.encontrarMaiorProduto(arrayNumeros);
        maximoProdutoAdjacente.encontrarMenorProduto(arrayNumeros);
    }
    

}
