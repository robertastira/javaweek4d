public class DipendenteFullTime extends Dipendente{
    public DipendenteFullTime(String matricola, double stipendio, TipoDipartimento tipoDipartimento) {
        super(matricola, 1500.50, tipoDipartimento);
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
