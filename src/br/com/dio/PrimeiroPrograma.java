package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {
       /*
       Gato gato = new Gato();
       System.out.println(gato);
       */
        Livro livro = new Livro("nome do livro", 300);
        System.out.println(livro);
        /*
        int a = 5;
        int b = 3;
        System.out.println("Hello Word!!!!");
        System.out.println("a + b = " + (a + b));
        */


    }

    static class Livro{
        private String nome;
        private int numPaginas;

        public Livro(String nome, int numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(int numPaginas) {
            this.numPaginas = numPaginas;
        }
    }
}
