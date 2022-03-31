package br.com.dio;

public class Livro {
    private String nome;
    private Integer numeroDePaginas;
    public Livro () {

    }
        public Livro (String nome, String s) {

    }
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public Integer getNumeroDePaginas () {
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
        @Override
            public String toString() {
                return "Livro{" + "nome='" + nome + '\'' + ", numeroDePaginas=" + numeroDePaginas + '}';
            }
}