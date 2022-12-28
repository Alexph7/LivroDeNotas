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

    // realiza várias operações nos dados, contém uma série de chamadas de método que geram um relatório que resume as notas.
    public void resumirNotas() {

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

    // gera a saída do gráfico de barras exibindo distribuição de notas
    public void saidaBarraGrafico() {
        System.out.print("Distribuição de Notas");

        // armazena frequência de notas em cada intervalo de 10 notas
        int[] frequencia = new int[11];

        //para cada nota, incrementa a frequência apropriadaÿ
        for (int nota : notas) {
            ++frequencia[nota / 10];
        }
        // para cada frequência de nota, imprime barra no gráfico
        for (int i = 0; i < frequencia.length; i++) {
            // gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
            if (i == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }
            // imprime a barra de asteriscos
            for (int asterisco = 0; asterisco < frequencia[i]; asterisco++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    //Gera a Saida de Texto De Array De Notas
    public void outputNotas() {
        System.out.printf("As Notas São: %n%n");
        /*
         * Uma instrução for controlada por contador deve ser utilizada nesse
         * caso, porque a variavel contadora estudante tem o valor utilizado
         * para saída de cada nota ao lado de um número de aluno particular.
         * Embora os índices de array iniciem em 0, em geral, um professor
         * numeraria os alunos iniciando em 1. Portanto , as linhas geram saída
         * de student + 1 como o número de aluno para produzir rótulos de nota
         * "Student 1: ", "Student 2: " e assim por diante
         */
        for (int estudante = 0; estudante < notas.length; estudante++) {
            System.out.printf("Estudante %2d: %3d%n", estudante + 1,
                  notas[estudante]);
        }
    }

}
