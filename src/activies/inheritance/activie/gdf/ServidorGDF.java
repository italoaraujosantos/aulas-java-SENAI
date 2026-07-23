package activies.inheritance.activie.gdf;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ServidorGDF {
    private String nome;
    private String matricula;
    private String orgaoLotado;

    public ServidorGDF(String nome, String matricula, String orgaoLotado) {
        this.nome = nome;
        this.matricula = matricula;
        this.orgaoLotado = orgaoLotado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getOrgaoLotado() {
        return orgaoLotado;
    }

    public void setOrgaoLotado(String orgaoLotado) {
        this.orgaoLotado = orgaoLotado;
    }

    public void baterPonto(){
        LocalDateTime data = LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Entrada \n2 - saída");
            opcao = scanner.nextInt();
            scanner.nextLine();
            if(opcao == 1) {
                System.out.println("Entrada: "+data);
            } else if(opcao == 2) {
                System.out.println("saída: "+data);
            } else {
                System.out.println("Opcao inválida!");
            }
        } while (true);
    }

    public void trabalhar() {
        System.out.println("\nServidor trabalhando!");
    }
}
