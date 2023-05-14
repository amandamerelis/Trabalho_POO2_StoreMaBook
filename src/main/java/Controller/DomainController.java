package Controller;

import DAO.*;
import Domain.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;

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

    //--------------------------------------------------CRUD LIVROS
    public int inserirLivro(String titulo, Date dataLancamento, String sinopse, byte[] capa, Autor autor, Genero genero) {
        Livro livro = new Livro(titulo, dataLancamento, sinopse, capa, autor, genero);
        livroDAO.inserir(livro);
        return livro.getId();
    }

    public List listar(Class classe) throws HibernateException {
        return genericDAO.listar(classe);
    }

    public List<Livro> pesquisarLivros(String pesquisa, int tipo) {
        List<Livro> lista = null;
        switch (tipo) {
            case 0:
                lista = livroDAO.pesquisarPorTitulo(pesquisa);
                break;

            case 1:
                lista = livroDAO.pesquisarPorAutor(pesquisa);
                break;

            case 2:
                lista = livroDAO.pesquisarPorID(pesquisa);
                break;
            case 3:
                lista = livroDAO.pesquisarPorGenero(pesquisa);
                break;
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
        livroDAO.alterar(livro);
    }

    public void excluirLivro(Livro livro) {

    }

    //--------------------------------------------------CRUD AUTORES
    public int inserirAutor(String nome, Date dataNascimento) {
        Autor autor = new Autor(nome, dataNascimento);
        autorDAO.inserir(autor);
        return autor.getId();
    }

    public List<Autor> listarAutores() {
        return null;
    }

    public List<Autor> pesquisarAutores(String pesquisa, int tipo) {
        List<Autor> lista = null;
        switch (tipo) {
            case 0:
                lista = autorDAO.pesquisarPorNome(pesquisa);
                break;

            case 1:
                lista = autorDAO.pesquisarPorID(pesquisa);
                break;
        }
        return lista;
    }

    public void alterarAutor(Autor autor, String nome, Date dataNascimento) {
        autor.setNome(nome);
        autor.setDataNascimento(dataNascimento);
        autorDAO.alterar(autor);
    }

    public void excluirAutor(Autor autor) {

    }

    //--------------------------------------------------CRUD RESENHAS
    public int inserirResenha(String avaliacao, String texto, Date dataPublicacao, Livro livro) {
        Resenha resenha = new Resenha(avaliacao, texto, dataPublicacao, livro);
        resenhaDAO.inserir(resenha);
        return resenha.getId();
    }

    public List<Resenha> listarResenhas() {
        return null;
    }

    public List<Resenha> pesquisarResenhas(String pesquisa, int tipo) {
        List<Resenha> lista = null;
        switch (tipo) {
            case 0:
                lista = resenhaDAO.pesquisarPorLivro(pesquisa);
                break;

            case 1:
                lista = resenhaDAO.pesquisarPorAvaliacao(pesquisa);
                break;
            case 2:
                lista = resenhaDAO.pesquisarPorID(pesquisa);
                break;
        }
        return lista;
    }

    public void alterarResenha(Resenha resenha, String avaliacao, String texto, Livro livro) {
        resenha.setAvaliacao(avaliacao);
        resenha.setTexto(texto);
        resenha.setLivro(livro);
    }

    public void excluirResenha(Resenha resenha) {

    }

    //--------------------------------------------------CRUD GENEROS
    public List<Genero> listarGeneros() {
        return null;
    }
}
