package Domain;

import java.io.Serializable;
import java.text.ParseException;
import javax.persistence.*;

/**
 *
 * @author AMANDA MERELIS
 */

@Entity
public class Genero implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="descricao", length=191, nullable=false)
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
