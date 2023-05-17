package Domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author AMANDA MERELIS
 */

@Entity
public class Resenha implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="avaliacao", length=15, nullable=false)
    private String avaliacao;
    
    @Column(name="texto", length=1500, nullable=false)
    private String texto;
    
    @Column(name="data_publicacao", updatable=false, nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dataPublicacao;
    
    @Column(name="ultima_modificacao")
    @Temporal(TemporalType.DATE)
    private Date ultimaModificacao;
    
    @ManyToOne
    @JoinColumn(name="id_livro", nullable=false)
    private Livro livro;

    public Resenha() {
    }

    public Resenha(String avaliacao, String texto, Date dataPublicacao, Livro livro) {
        this.avaliacao = avaliacao;
        this.texto = texto;
        this.dataPublicacao = dataPublicacao;
        this.livro = livro;
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{this, livro, avaliacao, getFormattedDataPublicacao()};
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    
    
    public String getFormattedDataPublicacao() throws ParseException{
        return Controller.FuncoesUteis.dateToStr(dataPublicacao);
    }
    
    public String getFormattedUltimaModificacao() throws ParseException{
        return Controller.FuncoesUteis.dateToStr(ultimaModificacao);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Date getUltimaModificacao() {
        return ultimaModificacao;
    }

    public void setUltimaModificacao(Date ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
}
