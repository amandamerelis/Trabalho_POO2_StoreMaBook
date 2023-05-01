package DAO;

import Domain.Livro;
import java.util.List;

/**
 *
 * @author AMANDA MERELIS
 */
public class LivroDAO {
    
    public int inserir(Livro livro){
        return -1;
    }
    
    public List<Livro> listar(){
        return null;
    }
    
    public List<Livro> pesquisar(String pesquisa, int tipo){
        return null;
    }
    
    public List<Livro> pesquisarPorTitulo(String pesquisa){
        return pesquisar(pesquisa,0);
    }
    
    public List<Livro> pesquisarPorAutor(String pesquisa){
        return pesquisar(pesquisa,1);
    }
    
    public List<Livro> pesquisarPorID(String pesquisa){
        return pesquisar(pesquisa,1);
    }
    
    public void alterar(Livro livro){
        
    }
    
    public void excluir(Livro livro){
        
    }
}
