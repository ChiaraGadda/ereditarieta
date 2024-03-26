public class App {
    public static void main(String[] args) throws Exception {
        Persona p1=new Persona("GDLCHR06L53D969C", "Chiara", "Gadaleta");
        System.out.println(p1+"\n\n");
        Studente s1=new Studente("GRTNDR06S22D969J", "Andrea", "Garatti", "69104", "Informatica");
        System.out.println(s1);
        Docente d1=new Docente("SRNGTN67S11D969K", "Gaetano", "Sberna", "Informatica", "1527");
        System.out.println(d1);
    }
}
