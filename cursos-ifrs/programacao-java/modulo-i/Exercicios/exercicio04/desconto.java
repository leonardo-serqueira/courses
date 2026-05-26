public class desconto {
    public static void main(String[] args){
        
        double preco;

        System.out.println("\nPROGRAMA 10% DE DESCONTO\n");
        
        System.out.print("Informe o preço: ");
        preco = Double.parseDouble(System.console().readLine());
        
        preco = preco - ((preco * 10) / 100);

        System.out.printf("\nNovo preco do produto:%.2f\n", preco );

    }
}
