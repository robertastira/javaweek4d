public class DipendentePartTime extends Dipendente {
    public int oreDiLavoro;

    public DipendentePartTime(String matricola, double stipendio, TipoDipartimento tipoDipartimento) {
        super(matricola, stipendio, tipoDipartimento);
        this.oreDiLavoro = 4;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Lo stipendio part time è: " + (this.stipendio/2));

    }

    @Override
    public void checkIn() {
        System.out.println("Inizio turno - Check In effettuato");
    }
}
