public class media3{
    
    public static void main(String[]args){

        double nota1, nota2, nota3, media;

        System.out.println("\nPROGRAMA MEDIA DE NOTAS");

        System.out.print("\nInforme a primeira nota: ");
        nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("\nInforme a segunda nota: ");
        nota2 = Double.parseDouble(System.console().readLine());

        System.out.print("\nInforme a terceira nota: ");
        nota3 = Double.parseDouble(System.console().readLine());

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("\nSua media: %.2f\n", media);


    }
}