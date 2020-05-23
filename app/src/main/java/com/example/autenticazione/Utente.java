package com.example.autenticazione;

public class Utente {
    String nomeUtente;
    String emailUtente;
    String passwordUtente;
    String confermaPasswordUtente;
    String encodedImage;

    public Utente() {
    }




    public Utente(String nomeUtente, String emailUtente, String passwordUtente, String confermaPasswordUtente, String encodedImage) {
        this.nomeUtente = nomeUtente;
        this.emailUtente = emailUtente;
        this.passwordUtente = passwordUtente;
        this.confermaPasswordUtente = confermaPasswordUtente;
        this.encodedImage= encodedImage;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public String getEmailUtente() {
        return emailUtente;
    }

    public String getPasswordUtente() {
        return passwordUtente;
    }

    public String getConfermaPasswordUtente() { return confermaPasswordUtente; }

    public String getEncodedImage() {return encodedImage; }
}
