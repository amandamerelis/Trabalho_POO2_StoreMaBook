package Domain;

import java.util.Date;

/**
 *
 * @author AMANDA MERELIS
 */

public class Autor {
    
    private int id;
    private String nome;
    private Date dataNascimento;
    private int totalLivrosCadastrados;

    public Autor() {
    }
    
    public Autor(String nome, Date dataNascimento, int totalLivrosCadastrados) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.totalLivrosCadastrados = totalLivrosCadastrados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTotalLivrosCadastrados() {
        return totalLivrosCadastrados;
    }

    public void setTotalLivrosCadastrados(int totalLivrosCadastrados) {
        this.totalLivrosCadastrados = totalLivrosCadastrados;
    }

}
