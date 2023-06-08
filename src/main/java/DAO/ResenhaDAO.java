package DAO;

import Domain.Autor;
import Domain.Resenha;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author AMANDA MERELIS
 */
public class ResenhaDAO extends GenericDAO {

    public List<Resenha> pesquisar(String pesquisa, int tipo) {
        Session sessao = null;
        List lista = null;

        try {
            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            //CRIAÇÃO DA CONSULTA E BUILDER
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Resenha.class);

            //CLÁUSULA FROM DA CONSULTA
            Root tabela = consulta.from(Resenha.class);

            Predicate restricoes = null;
            switch (tipo) {
                case 1: //pesquisar por Nome
                    restricoes = builder.like(tabela.get("livro").get("titulo"), "%" + pesquisa + "%");
                    break;
                case 2: //pesquisar por Nome
                    restricoes = builder.like(tabela.get("livro").get("autor").get("nome"), "%" + pesquisa + "%");
                    break;
                case 3: //pesquisar por Nome
                    restricoes = builder.like(tabela.get("avaliacao"), "%" + pesquisa + "%");
                    break;
            }

            //CLÁUSULA WHERE
            consulta.where(restricoes);

            //EXECUTAR A CONSULTA
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
        }
        return lista;
    }

    public List<Resenha> pesquisarPorLivro(String pesquisa) {
        return pesquisar(pesquisa, 1);
    }

    public List<Resenha> pesquisarPorAutor(String pesquisa) {
        return pesquisar(pesquisa, 2);
    }

    public List<Resenha> pesquisarPorAvaliacao(String pesquisa) {
        return pesquisar(pesquisa, 3);
    }

    public void alterar(Resenha resenha) {

    }
}
