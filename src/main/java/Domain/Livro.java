package Domain;

import java.util.Date;

/**
 *
 * @author AMANDA MERELIS
 */

public class Livro {
    
    private int id;
    private String titulo;
    private Date dataLancamento;
    private Byte[] capa;

    public Livro() {
    }

    public Livro(String titulo, Date dataLancamento, Byte[] capa) {
        this.titulo = titulo;
        this.dataLancamento = dataLancamento;
        this.capa = capa;
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

    public Byte[] getCapa() {
        return capa;
    }

    public void setCapa(Byte[] capa) {
        this.capa = capa;
    }
    
}
