package expensecontrol;

//Classe principal para a execução do sistema
import java.util.ArrayList;
import java.util.Scanner;

//Classe principal para execução do sistema
public class expensecontrol {

//Método principal para iniciar o programa
public static void main(String[] args) {
 // Inicializa a lista de despesas
 ArrayList<Despesa> despesas = new ArrayList<>();
 // Inicializa a lista de categorias
 ArrayList<Categoria> categorias = new ArrayList<>();
 Scanner scanner = new Scanner(System.in);

 // Menu principal do sistema
 int opcao = 0;
 while (opcao != 4) {
     System.out.println("\n=== Sistema de Controle de Despesas ===");
     System.out.println("1. Adicionar Categoria");
     System.out.println("2. Adicionar Despesa");
     System.out.println("3. Exibir Relatório de Despesas");
     System.out.println("4. Sair");
     System.out.print("Escolha uma opção: ");
     opcao = scanner.nextInt();
     scanner.nextLine(); // Limpa o buffer de entrada

     switch (opcao) {
         case 1:
             // Adiciona uma nova categoria
             System.out.print("Nome da Categoria: ");
             String nomeCategoria = scanner.nextLine();
             categorias.add(new Categoria(nomeCategoria));
             System.out.println("Categoria '" + nomeCategoria + "' adicionada com sucesso!");
             break;
         case 2:
             // Adiciona uma nova despesa
             if (categorias.isEmpty()) {
                 System.out.println("Você precisa adicionar uma categoria antes de adicionar despesas.");
             } else {
                 System.out.print("Descrição da Despesa: ");
                 String descricao = scanner.nextLine();
                 System.out.print("Valor da Despesa: ");
                 double valor = scanner.nextDouble();
                 scanner.nextLine(); // Limpa o buffer de entrada

                 // Exibe as categorias disponíveis
                 System.out.println("Escolha a categoria da despesa:");
                 for (int i = 0; i < categorias.size(); i++) {
                     System.out.println((i + 1) + ". " + categorias.get(i).getNome());
                 }
                 int categoriaEscolhida = scanner.nextInt() - 1;
                 scanner.nextLine(); // Limpa o buffer de entrada

                 // Adiciona a despesa à lista
                 despesas.add(new Despesa(descricao, valor, categorias.get(categoriaEscolhida)));
                 System.out.println("Despesa adicionada com sucesso!");
             }
             break;
         case 3:
             // Exibe o relatório de despesas
             if (despesas.isEmpty()) {
                 System.out.println("Nenhuma despesa registrada.");
             } else {
                 double totalGastos = 0;
                 System.out.println("\n=== Relatório de Despesas ===");
                 for (Despesa despesa : despesas) {
                     System.out.println(despesa);
                     totalGastos += despesa.getValor();
                 }
                 System.out.println("Total de gastos: R$" + totalGastos);
             }
             break;
         case 4:
             // Encerra o programa
             System.out.println("Saindo do sistema...");
             break;
         default:
             System.out.println("Opção inválida, tente novamente.");
     }
 }
 scanner.close(); // Fecha o scanner para evitar vazamento de memória
}
}

//Classe que representa uma Categoria de despesa
class Categoria {
private String nome;

//Construtor da classe Categoria
public Categoria(String nome) {
 this.nome = nome;
}

//Método getter para obter o nome da categoria
public String getNome() {
 return nome;
}
}

//Classe que representa uma Despesa
class Despesa {
private String descricao;
private double valor;
private Categoria categoria; // Cada despesa está associada a uma categoria

//Construtor da classe Despesa
public Despesa(String descricao, double valor, Categoria categoria) {
 this.descricao = descricao;
 this.valor = valor;
 this.categoria = categoria;
}

//Método getter para obter o valor da despesa
public double getValor() {
 return valor;
}

//Método para retornar a descrição da despesa formatada
@Override
public String toString() {
 return "Descrição: " + descricao + " | Valor: R$" + valor + " | Categoria: " + categoria.getNome();
	}
}