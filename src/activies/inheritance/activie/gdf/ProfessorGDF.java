package activies.inheritance.activie.gdf;

public class ProfessorGDF extends ServidorGDF{
    private String disciplina;

    public ProfessorGDF(String nome, String matricula, String orgaoLotado, String disciplina) {
        super(nome, matricula, orgaoLotado);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public void trabalhar() {
        super.trabalhar();
        System.out.println("Professor");
        System.out.println("Lecionando aulas de "+ProfessorGDF.this.getDisciplina());
    }

}
