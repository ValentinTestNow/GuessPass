
public class RegistroPassword {

    private String nome;
    private String cognome;


    public void AggiungiUtente(String nome, String cognome){
        setnome(nome);
        setcognome(cognome);
    }

    public String toString(){
        return "Utente: " +nome+ " "+cognome+" ";
    }


    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getcognome() {
        return cognome;
    }
    public void setcognome(String cognome) {
        this.cognome = cognome;
    }


    
}
