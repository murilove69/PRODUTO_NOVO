import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoNovo {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    // Primeiro construtor - este recebe todos os atributos por parâmetro.
    public ProdutoNovo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
    }

    // Segundo construtor - recebe o nome, preço de custo, preço de venda e data de fabricação.
    public ProdutoNovo(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS); 
    }

    // Terceiro construtor - recebe apenas o nome e preço de custo.
    public ProdutoNovo(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10;
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);  
    }

    // Getters para os atributos
    public String getNome() {
        return nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    // Método para exibir informações do produto
    public void imprimeDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Preço de Custo: R$%.2f\n", precoCusto);
        System.out.printf("Preço de Venda: R$%.2f\n", precoVenda);
        System.out.println("Data de Fabricação: " + dataFabricacao);
        System.out.println("Data de Validade: " + dataValidade);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Testando o primeiro construtor
        ProdutoNovo p1 = new ProdutoNovo("Produto A", 100.00, 150.00, LocalDate.of(2024, 9, 20), LocalDate.of(2025, 9, 20));
        p1.imprimeDados();

        // Testando o segundo construtor 
        ProdutoNovo p2 = new ProdutoNovo("Produto B", 80.00, 120.00, LocalDate.of(2024, 9, 20));
        p2.imprimeDados();

        // Testando o terceiro construtor 
        ProdutoNovo p3 = new ProdutoNovo("Produto C", 50.00);
        p3.imprimeDados();
    }
}
