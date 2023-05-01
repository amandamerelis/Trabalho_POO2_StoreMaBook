package DAO;

import Domain.Autor;
import java.util.List;

/**
 *
 * @author AMANDA MERELIS
 */
public class AutorDAO {
 
    public int inserir(Autor autor){
        return -1;
    }
    
    public List<Autor> listar(){
        return null;
    }
    
    public List<Autor> pesquisar(String pesquisa, int tipo){
        return null;
    }
    
    public List<Autor> pesquisarPorNome(String pesquisa){
        return pesquisar(pesquisa,0);
    }
    
    public List<Autor> pesquisarPorID(String pesquisa){
        return pesquisar(pesquisa,1);
    }
    
    public void alterar(Autor autor){
        
    }
    
    public void excluir(Autor autor){
        
    }
    
}
