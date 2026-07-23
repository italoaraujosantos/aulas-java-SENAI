package activies.inheritance.activie.gdf;

import java.util.Scanner;

public class PolicialGDF extends ServidorGDF{
    private String patente;

    public PolicialGDF(String nome, String matricula, String orgaoLotado, String patente) {
        super(nome, matricula, orgaoLotado);
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void fazerRonda() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Infome a localidade da ronda: ");
        String text = scanner.nextLine();
        scanner.nextLine();
        System.out.println("A ronda sera realizada na Localidade: \n "+ text);
        scanner.close();
    }

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Policial");
        System.out.println("Realiza rondas ostencivas!");
    }

}
