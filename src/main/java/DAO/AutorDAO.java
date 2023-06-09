package DAO;

import Domain.Autor;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author AMANDA MERELIS
 */
public class AutorDAO extends GenericDAO {

    public List<Autor> pesquisar(String pesquisa, int tipo) {
        Session sessao = null;
        List lista = null;

        try {
            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();

            //CRIAÇÃO DA CONSULTA E BUILDER
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Autor.class);

            //CLÁUSULA FROM DA CONSULTA
            Root tabela = consulta.from(Autor.class);

            Predicate restricoes = null;
            switch (tipo) {
                case 0: //pesquisar por Nome
                    restricoes = builder.like(tabela.get("nome"), "%" + pesquisa + "%");
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
    
    public List<Autor> listarAutoresETotalLivros(String pesquisa) {
        Session sessao = null;
        List<Autor> lista = new ArrayList();

        try {
            sessao = HibernateConnection.getSessionFactory().openSession();
            sessao.beginTransaction();
            String consultaSQL = "SELECT a.id, a.nome, a.data_nascimento, "
                    + "(SELECT COUNT(DISTINCT l.id) FROM Livro l WHERE l.id_autor = a.id) as total_livros "
                    + "FROM Autor a "
                    + "WHERE a.nome LIKE ?1 "
                    + "ORDER BY a.nome ASC, total_livros DESC";
            
            Query query = sessao.createNativeQuery(consultaSQL)
                    .setParameter(1, "%"+pesquisa+"%");
            
            List<Object[]> autores = query.getResultList();
            
            for (Object[] a : autores) {
                BigInteger contador = (BigInteger) a[3];
                String contadorStr = contador.toString();
                
                int id = (int) a[0];
                String nome = (String) a[1];
                Date dt_nasc = (Date) a[2];
                int total_livros = Integer.parseInt(contadorStr);
                
                lista.add(new Autor(id, nome, dt_nasc, total_livros));
            }
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

    public List<Autor> pesquisarPorNome(String pesquisa) {
        return pesquisar(pesquisa, 0);
    }

    public void alterar(Autor autor) {

    }
}
