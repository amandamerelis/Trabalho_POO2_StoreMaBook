package Controller;

import DAO.*;
import Domain.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import javax.persistence.PersistenceException;
import org.hibernate.HibernateException;
import org.hibernate.exception.ConstraintViolationException;

public class DomainController {

    LivroDAO livroDAO = null;
    AutorDAO autorDAO = null;
    ResenhaDAO resenhaDAO = null;
    GenericDAO genericDAO = null;

    public DomainController() throws ClassNotFoundException, SQLException {
        HibernateConnection.getSessionFactory();
        livroDAO = new LivroDAO();
        autorDAO = new AutorDAO();
        resenhaDAO = new ResenhaDAO();
        genericDAO = new GenericDAO();
    }

    
     //--------------------------------------------------OPERAÇÕES GENÉRICAS
    public List listar(Class classe) throws HibernateException {
        return genericDAO.listar(classe);
    }
    
    public void excluir(Object obj) throws PersistenceException {
        genericDAO.excluir(obj);
    }
    
    //--------------------------------------------------CRUD LIVROS
    public int inserirLivro(String titulo, Date dataLancamento, String sinopse, byte[] capa, Autor autor, Genero genero) {
        Livro livro = new Livro(titulo, dataLancamento, sinopse, capa, autor, genero);
        genericDAO.inserir(livro);
        return livro.getId();
    }

    /*Por padrão, a opção 0 sempre será uma listagem de todos os registros*/
    public List<Livro> pesquisarLivros(String pesquisa, int tipo) {
        List<Livro> lista = null;
        switch (tipo) {
            case 0: lista = genericDAO.listar(Livro.class); break;
            
            case 1: lista = livroDAO.pesquisarPorTitulo(pesquisa);break;

            case 2: lista = livroDAO.pesquisarPorAutor(pesquisa);break;

            case 3: lista = livroDAO.pesquisarPorGenero(pesquisa);break;
        }
        return lista;
    }
    
    public void alterarLivro(Livro livro, String titulo, Date dataLancamento, String sinopse, byte[] capa, Autor autor, Genero genero) {
        livro.setTitulo(titulo);
        livro.setDataLancamento(dataLancamento);
        livro.setSinopse(sinopse);
        livro.setCapa(capa);
        livro.setAutor(autor);
        livro.setGenero(genero);
        genericDAO.alterar(livro);
    }
    
    //--------------------------------------------------CRUD AUTORES
    public int inserirAutor(String nome, Date dataNascimento) {
        Autor autor = new Autor(nome, dataNascimento);
        genericDAO.inserir(autor);
        return autor.getId();
    }
    
    public List<Autor> pesquisarAutores(String pesquisa) {
        /*List<Autor> lista = autorDAO.pesquisarPorNome(pesquisa);*/
        List<Autor> lista = autorDAO.listarAutoresETotalLivros(pesquisa);
        return lista;
    }

    public void alterarAutor(Autor autor, String nome, Date dataNascimento) {
        autor.setNome(nome);
        autor.setDataNascimento(dataNascimento);
        genericDAO.alterar(autor);
    }

    //--------------------------------------------------CRUD RESENHAS
    public int inserirResenha(int avaliacao, String texto, Date dataPublicacao, Livro livro) {
        Resenha resenha = new Resenha(avaliacao, texto, dataPublicacao, livro);
        resenha.setUltimaModificacao(dataPublicacao);
        genericDAO.inserir(resenha);
        return resenha.getId();
    }

    public List<Resenha> pesquisarResenhas(String pesquisa, int tipo) {
        List<Resenha> lista = null;
        switch (tipo) {
            case 0: lista = genericDAO.listar(Resenha.class);break;
            case 1: lista = resenhaDAO.pesquisarPorLivro(pesquisa);break;
            case 2: lista = resenhaDAO.pesquisarPorAutor(pesquisa);break;
            case 3: lista = resenhaDAO.pesquisarPorAvaliacao(pesquisa);break;
        }
        return lista;
    }

    public void alterarResenha(Resenha resenha, int avaliacao, String texto, Livro livro, Date dataAlteracao) {
        resenha.setAvaliacao(avaliacao);
        resenha.setTexto(texto);
        resenha.setLivro(livro);
        resenha.setUltimaModificacao(dataAlteracao);
        genericDAO.alterar(resenha);
    }
}
