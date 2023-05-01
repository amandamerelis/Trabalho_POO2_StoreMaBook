package Domain;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author AMANDA MERELIS
 */

public class Livro {
    
    private int id;
    private String titulo;
    private Date dataLancamento;
    private String sinopse;
    private byte[] capa;
    private Autor autor;
    private Genero genero;

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
        return new Object[]{id, this, titulo, autor, getFormattedDataLancamento(), capa};
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
    
}
