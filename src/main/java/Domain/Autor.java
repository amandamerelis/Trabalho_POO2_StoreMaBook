package Domain;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
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
    @Temporal (TemporalType.DATE)
    private Date dataNascimento;
    
    @Transient
    @Column(name="total_livros")
    private int totalLivrosCadastrados;
    
    @OneToMany(mappedBy = "autor", fetch = FetchType.EAGER)
    private List<Livro> livros;

    public Autor() {
    }
    
    public Autor(String nome, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    
    public Autor(int id, String nome, Date dataNascimento, int totalLivrosCadastrados) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.totalLivrosCadastrados = totalLivrosCadastrados;
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{this, getFormattedDataNascimento(), totalLivrosCadastrados};
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        return this.id == other.id;
    }
    
}
