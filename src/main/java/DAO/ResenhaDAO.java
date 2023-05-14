package DAO;

import Domain.Resenha;
import java.util.List;

/**
 *
 * @author AMANDA MERELIS
 */
public class ResenhaDAO extends GenericDAO {

    public List<Resenha> pesquisar(String pesquisa, int tipo) {
        return null;
    }

    public List<Resenha> pesquisarPorLivro(String pesquisa) {
        return pesquisar(pesquisa, 0);
    }

    public List<Resenha> pesquisarPorAvaliacao(String pesquisa) {
        return pesquisar(pesquisa, 1);
    }

    public List<Resenha> pesquisarPorID(String pesquisa) {
        return pesquisar(pesquisa, 1);
    }

    public void alterar(Resenha resenha) {

    }
}
