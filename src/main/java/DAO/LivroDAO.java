package DAO;

import Domain.Livro;
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
public class LivroDAO extends GenericDAO {

    public List<Livro> pesquisar(String pesquisa, int tipo) {
        Session sessao = null;
        List lista = null;

        try {
            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            //CRIAÇÃO DA CONSULTA E BUILDER
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Livro.class);

            //CLÁUSULA FROM DA CONSULTA
            Root tabela = consulta.from(Livro.class);

            Predicate restricoes = null;
            switch (tipo) {
                case 1: //pesquisar por Titulo
                    restricoes = builder.like(tabela.get("titulo"), "%" + pesquisa + "%");break;                
                case 2: //pesquisar por Autor
                    restricoes = builder.like(tabela.get("autor").get("nome"), "%" + pesquisa + "%");break;
                case 3: //pesquisar por Gênero
                    restricoes = builder.like(tabela.get("genero").get("descricao"), "%" + pesquisa + "%");break;
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

    public List<Livro> pesquisarPorTitulo(String pesquisa) {
        return pesquisar(pesquisa, 1);
    }

    public List<Livro> pesquisarPorAutor(String pesquisa) {
        return pesquisar(pesquisa, 2);
    }

    public List<Livro> pesquisarPorGenero(String pesquisa) {
        return pesquisar(pesquisa, 3);
    }
}
