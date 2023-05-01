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
public class Autor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="nome", length=191, nullable=false)
    private String nome;
    
    @Column(name="data_nascimento", nullable=false)
    @Temporal ( TemporalType.DATE)
    private Date dataNascimento;
    
    @Transient
    private int totalLivrosCadastrados;

    public Autor() {
    }
    
    public Autor(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{id, this, getFormattedDataNascimento(), totalLivrosCadastrados};
    }

    @Override
    public String toString() {
        return nome;
    }
    
    public String getFormattedDataNascimento() throws ParseException{
        return Controller.FuncoesUteis.dateToStr(dataNascimento);
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
