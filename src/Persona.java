public class Persona {
    private String codFisc;
    private String nome;
    private String cognome;

    public Persona(String codFisc, String nome, String cognome){
        this.codFisc=codFisc;
        this.nome=nome;
        this.cognome=cognome;        
    }
    
    public String getCodFisc(){
        return codFisc;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public String toString(){
        return "codice fiscale: "+codFisc+"\nnome: "+nome+"\ncognome: "+cognome;
    }
}
