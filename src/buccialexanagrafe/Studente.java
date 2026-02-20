/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buccialexanagrafe;

/**
 *
 * @author bucci.alex
 */
public class Studente {
    private String matricola;
    private String nome;
    private String cognome;
    private String anno;
    private String sezione;
    private String indirizzo;

    public Studente(String matricola, String nome, String cognome, String anno, String sezione, String indirizzo) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
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

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    @Override
    public String toString() {
        return "Studente{" + "matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome + ", anno=" + anno + ", sezione=" + sezione + ", indirizzo=" + indirizzo + '}';
    }
    
    
}
