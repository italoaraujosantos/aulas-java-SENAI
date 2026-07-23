package activies.inheritance.activie;

import activies.inheritance.activie.gdf.PolicialGDF;
import activies.inheritance.activie.gdf.ProfessorGDF;

public class Main {
    public static void main(String[] args) {
        ProfessorGDF professor = new ProfessorGDF("Graziela Guarda", "156894", "SEEDF", "Programação");

        PolicialGDF policial = new PolicialGDF("Castro", "156456", "SESPDF", "Sargento");

        professor.trabalhar();

        policial.trabalhar();
    }
}
