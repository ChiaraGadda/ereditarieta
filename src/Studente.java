public class Studente extends Persona{
    private String numMat;
    private String uni;
    public Studente(String codFisc, String nome, String cognome, String numMat, String uni){
        super(codFisc, nome, cognome);  
        this.numMat=numMat;
        this.uni=uni;
    }
    public String getNumMat(){
        return numMat;
    }
    public String getUni(){
        return uni;
    }
    @Override
    public String toString(){
        return super.toString()+"\nnumero di matricola: "+numMat+"\nuniversità: "+uni+"\n\n";
    }
}
