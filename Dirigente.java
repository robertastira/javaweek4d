public class Dirigente extends Dipendente{


    public Dirigente(String matricola, double stipendio, TipoDipartimento tipoDipartimento) {
        super(matricola, stipendio, tipoDipartimento);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio full time è: " + this.stipendio );
    }

    @Override
    public void checkIn() {
        System.out.println("Inizio turno - Check In effettuato");

    }
}
