package Domain;

import java.text.ParseException;

/**
 *
 * @author AMANDA MERELIS
 */

public class Genero {
    
    private int id;
    private String descricao;

    public Genero() {
    }

    @Override
    public String toString() {
        return descricao;
    }
    public Object[] toArray() throws ParseException {
        return new Object[]{this, descricao};
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
