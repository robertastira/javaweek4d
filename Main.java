public class Main {

    public static void main(String[] args){
       //Dipendente Paolo = new Dipendente("050", 1554.50, TipoDipartimento.AMMINISTRAZIONE);
        // System.out.println(Paolo);
        //Dipendente Alessandro = new Dipendente("055",2100.5, TipoDipartimento.VENDITE);
        //Dipendente Ornella  = new Dipendente("030", 1400.50, TipoDipartimento.PRODUZIONE);

       // Dipendente[] Dipendenti = {Paolo, Alessandro, Ornella};

       // for ( int i=0; i< Dipendenti.length ; i++) {
        //    Dipendente currentDip = Dipendenti[i];
       //     System.out.print("La matricola del dipendente è: " + currentDip.getMatricola() + "  ");

     DipendenteFullTime Paolo = new DipendenteFullTime("096", 1300.50, TipoDipartimento.AMMINISTRAZIONE);
     DipendentePartTime Luca = new DipendentePartTime("065", 1200.50, TipoDipartimento.PRODUZIONE);
     Dirigente Sergio = new Dirigente("004", 1600, TipoDipartimento.AMMINISTRAZIONE);
     Dirigente Antonio = new Dirigente("007",1600.5, TipoDipartimento.VENDITE);
     DipendentePartTime Matteo = new DipendentePartTime("050", 1200.50, TipoDipartimento.PRODUZIONE);
     DipendenteFullTime Lucia = new DipendenteFullTime("046", 1400.5,TipoDipartimento.VENDITE);

     Dipendente[] alldipendenti  = {Paolo,Luca,Sergio, Antonio, Matteo, Lucia};
     for (Dipendente dipendente : alldipendenti){
         dipendente.calculateSalary();
     }
        }
    }

