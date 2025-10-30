package Library;
public class Livro {
    private String título;
    private String autor;
    private double preco;

    public Livro(String título, String autor, double preco) {
        this.título = título;
        this.autor = autor;
        this.preco = preco;
    }


    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    


    
}
