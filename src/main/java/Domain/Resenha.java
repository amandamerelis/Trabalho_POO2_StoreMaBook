package Domain;

import java.util.Date;

/**
 *
 * @author AMANDA MERELIS
 */

public class Resenha {
    
    private int id;
    private int avaliacao;
    private Date dataPublicacao;

    public Resenha() {
    }

    public Resenha(int avaliacao, Date dataPublicacao) {
        this.avaliacao = avaliacao;
        this.dataPublicacao = dataPublicacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
}
