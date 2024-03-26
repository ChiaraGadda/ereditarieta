import java.util.ArrayList;

public class Scuola {
    private ArrayList<Persona> persone = new ArrayList<Persona>();

    public String toString(){
        String str="";
        for(int i=0; i<persone.size(); i++){
            str+=persone.toString();
        }
        return str;
    }
    public void add(Persona p){
        persone.add(p);
    }
}
