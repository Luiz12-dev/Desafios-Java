package DesafioEcommerce;

public class CalculadoraDeCompra {
    
    /*  
    public double calcularValorFinal(double valorTotal, double percentualDesconto, double valorBonus, String cupom){
        

       //Descobre o valor real do produto apenas com o desconto percentual 
       double valorProdutoComDesconto = valorTotal - (valorTotal * (percentualDesconto / 100.0));


         //Aplica o valor do bônus
         if(cupom.equalsIgnoreCase("DEZOFF")){
            valorProdutoComDesconto -= 10.0;
            System.out.println("Aplicando cupom DEZOFF: R$ 10,00 de desconto");
         }

         double valorFinal = valorProdutoComDesconto - valorBonus;

        return valorFinal;
    }

    */


    public double calcularValorFinal(double valorTotal, double percentualDesconto, double valorBonus, String cupom){
        

       double valorAtual = valorTotal;

       valorAtual -=(valorTotal * (percentualDesconto / 100.0));

       if(cupom != null && cupom.equalsIgnoreCase("DEZOFF")){
        valorAtual -= 10.0;
        System.out.println("Aplicando cupom DEZOFF: R$ 10,00 de desconto"); 
       }

       valorAtual -= valorBonus;

         return valorAtual;

    }
}
