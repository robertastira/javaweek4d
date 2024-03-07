public class Volontario implements CheckIn {
    public String nome;
    public int eta;
    public String CV;

    public Volontario(String nome, int eta, String CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Inizio turno - Check In effettuato");

    }
}
