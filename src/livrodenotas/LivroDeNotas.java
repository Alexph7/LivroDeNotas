package livrodenotas;

/**
 *
 * @author ph757
 */
public class LivroDeNotas {

    private String NomeDoCurso;
    private int[] notas;

    public LivroDeNotas(String NomeDoCurso, int[] notas) {
        this.NomeDoCurso = NomeDoCurso;
        this.notas = notas;
    }

    public String getNomeDoCurso() {
        return NomeDoCurso;
    }

    public void setNomeDoCurso(String NomeDoCurso) {
        this.NomeDoCurso = NomeDoCurso;
    }

    // realiza várias operações nos dados
    public void processarNotas() {

        //Mostra a Saida do Array de Notas
        outputNotas();

        //Chama Metodo de Media Para Calcular a nota media
        System.out.printf("%nMedia da Classe é: %.2f%n", getMedia());

        // chama métodos getMinimo e getMaximo
    }

    public int getMinimo() {
        int notaBaixa = notas[0]; //supõe que notas[0] é a menor nota

        //Faz Loop Pelo Array de Notas
        for (int nota : notas) {
            // se nota for mais baixa que lowGrade, atribui essa nota a lowGrade
            if (nota < notaBaixa) {
                notaBaixa = nota; //nova nota mais baixa
            }
        }
        return notaBaixa;
    }

    public int notaMaxima() {
        int notaAlta = notas[0]; //supõe que notas[0] é a maior nota

        //Faz um loop pelo Array
        for (int nota : notas) {
            if (nota > notaAlta) {
                notaAlta = nota;
            }
        }
        return notaAlta;
    }

    // determina média para o teste
    public double getMedia() {
        int total = 0;

        //Soma Notas De Um Aluno
        for (int nota : notas) {
            total += nota;
        }
        //retorna media da notas
        return (double) total / notas.length;
    }

    //Gera a Saida de Texto De Array De Notas
    public void outputNotas() {
        System.out.printf("As Notas São: %n%n");

        for (int estudante = 0; estudante < notas.length; estudante++) {
            System.out.printf("Estudante %2d: %3d%n", estudante + 1, notas[estudante]);
        }
    }

}
