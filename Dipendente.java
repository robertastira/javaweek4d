public abstract class Dipendente {
    protected String matricola;
    protected double stipendio;
    protected TipoDipartimento tipoDipartimento;

    public Dipendente(String matricola, double stipendio, TipoDipartimento tipoDipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.tipoDipartimento = TipoDipartimento.AMMINISTRAZIONE;
    }


    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public TipoDipartimento getTipoDipartimento() {
        return tipoDipartimento;
    }

    public void setTipoDipartimento(TipoDipartimento tipoDipartimento) {
        this.tipoDipartimento = tipoDipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", tipoDipartimento=" + tipoDipartimento +
                '}';
    }

    public abstract void calculateSalary();


}
