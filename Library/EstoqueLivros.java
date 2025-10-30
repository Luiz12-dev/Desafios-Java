package Library;
import java.util.Comparator;
import java.util.List;


public class EstoqueLivros {

    private List<Livro> livros;
    


    public EstoqueLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionarLivro(Livro livro){
        if(livro == null){
            throw new RuntimeException("Erro, Livro nulo");
        }

        livros.add(livro);
    }

    public Livro obterLivroMaisBarato(){

        if(livros.isEmpty()){
            return null;
        }

        return livros.stream()
        .min(Comparator.comparing(Livro::getPreco))
        .orElse(null);

    }

    public Livro obterLivroMaisCaro(){
        if(livros.isEmpty()){
            return null;
        }

        return livros.stream()
        .max(Comparator.comparing(Livro::getPreco))
        .orElse(null);
    }



    
}
