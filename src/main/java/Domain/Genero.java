package Domain;

/**
 *
 * @author AMANDA MERELIS
 */

public class Genero {
    
    private int id;
    private String descricao;

    public Genero() {
    }
    
    public Genero(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
