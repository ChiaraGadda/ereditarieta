public class Docente extends Persona {
    private String materia;
    private String salario;

    public Docente(String codFisc, String nome, String cognome, String materia, String salario) {
        super(codFisc, nome, cognome);
        this.materia = materia;
        this.salario = salario;
    }
    public String getMateria(){
        return materia;
    }
    public String getSalario(){
        return salario;
    }
    public String toString(){
        return super.toString()+"\nmateria: "+materia+"\nsalario: "+salario+"\n\n";
    }
}
