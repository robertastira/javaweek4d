public class Main {

    public static void main(String[] args){
        Dipendente Paolo = new Dipendente("050", 1554.50, TipoDipartimento.AMMINISTRAZIONE);
        System.out.println(Paolo);
        Dipendente Alessandro = new Dipendente("055",2100.5, TipoDipartimento.VENDITE);
        Dipendente Ornella  = new Dipendente("030", 1400.50, TipoDipartimento.PRODUZIONE);

        Dipendente[] Dipendenti = {Paolo, Alessandro, Ornella};

        for ( int i=0; i< Dipendenti.length ; i++) {
            Dipendente currentDip = Dipendenti[i];
            System.out.print("La matricola del dipendente è: " + currentDip.getMatricola() + "  ");
        }
    }
}
