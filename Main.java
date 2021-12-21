
public class Main {
    public static void main(String[] args) {
        System.out.println("GuessPass");
        System.out.println("Java sulla gestione delle password");

        RegistroPassword Rp1 = new RegistroPassword();

        Rp1.AggiungiUtente("Valentin", "Popa");
            System.out.println(Rp1.toString());
    }

    
}