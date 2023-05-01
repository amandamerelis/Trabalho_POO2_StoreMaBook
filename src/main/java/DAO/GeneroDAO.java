package DAO;

import Domain.Genero;
import java.util.List;

/**
 *
 * @author AMANDA MERELIS
 */
public class GeneroDAO {
    
    public List<Genero> pesquisar(String pesquisa, int tipo){
        return null;
    }
    
    public List<Genero> pesquisarPorGenero(String pesquisa){
        return pesquisar(pesquisa,0);
    }
    
    public List<Genero> pesquisarPorID(String pesquisa){
        return pesquisar(pesquisa,1);
    }
    
}
