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
public class Livro implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="titulo", length=255, nullable=false)
    private String titulo;
    
    @Column(name="data_lancamento", nullable=false)
    @Temporal(TemporalType.DATE)
    private Date dataLancamento;
    
    @Column(name="sinopse", length=600, nullable=false)
    private String sinopse;
    
    @Lob
    private byte[] capa;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_autor", nullable=false)
    private Autor autor;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="id_genero", nullable=false)
    private Genero genero;
    
    @OneToMany(mappedBy = "livro", fetch = FetchType.EAGER)
    private List<Resenha> resenhas;

    public Livro() {
    }

    public Livro(String titulo, Date dataLancamento, String sinopse, byte[] capa, Autor autor, Genero genero) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.sinopse = sinopse;
        this.capa = capa;
        this.autor = autor;
        this.genero = genero;
    }

    public Object[] toArray() throws ParseException {
        return new Object[]{this, autor, genero, getFormattedDataLancamento(), capa};
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    public String getFormattedDataLancamento() throws ParseException{
        return Controller.FuncoesUteis.dateToStr(dataLancamento);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    public byte[] getCapa() {
        return capa;
    }

    public void setCapa(byte[] capa) {
        this.capa = capa;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Resenha> getResenhas() {
        return resenhas;
    }

    public void setResenhas(List<Resenha> resenhas) {
        this.resenhas = resenhas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.id;
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
        final Livro other = (Livro) obj;
        return this.id == other.id;
    }

}
