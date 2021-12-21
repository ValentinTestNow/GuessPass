
public class RegistroPassword {

    private String nome;
    private String cognome;


    public void AggiungiUtente(String Nome, String Cognome){
        setNome(nome);
        setCognome(cognome);
    }

    public String toString(){
        return "Utente: " +nome+ " "+cognome+" ";
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    
}
