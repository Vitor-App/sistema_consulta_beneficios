import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CONSULTA DE BENEFÍCIOS ===");

        System.out.print("Nome do colaborador: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Tempo de empresa, em anos: ");
        int tempoEmpresa = scanner.nextInt();

        System.out.print("Quantidade de filhos: ");
        int filhos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Modalidade de trabalho (presencial/home office): ");
        String modalidade = scanner.nextLine().toLowerCase();

        System.out.print("Utiliza veículo próprio (sim/não): ");
        String veiculo = scanner.nextLine().toLowerCase();

        System.out.println("\n=== RESULTADO PARA " + nome + " ===");

        if (salario <= 3000) {
            System.out.println("Vale-alimentação: SIM");
        } else {
            System.out.println("Vale-alimentação: NÃO");
        }

        if (filhos > 0 && salario <= 4000) {
            System.out.println("Auxílio-creche: SIM");
        } else {
            System.out.println("Auxílio-creche: NÃO");
        }

        if (idade >= 18) {
            System.out.println("Plano de saúde: SIM");
        } else {
            System.out.println("Plano de saúde: NÃO");
        }

        if (modalidade.equals("home office")) {
            System.out.println("Auxílio home office: SIM");
        } else {
            System.out.println("Auxílio home office: NÃO");
        }

        if (modalidade.equals("presencial") && veiculo.equals("sim")) {
            System.out.println("Auxílio combustível: SIM");
        } else {
            System.out.println("Auxílio combustível: NÃO");
        }

        if (tempoEmpresa >= 1) {
            System.out.println("Participação na PLR: SIM");
        } else {
            System.out.println("Participação na PLR: NÃO");
        }

        if (idade <= 30 && tempoEmpresa >= 1) {
            System.out.println("Bolsa de estudos: SIM");
        } else {
            System.out.println("Bolsa de estudos: NÃO");
        }

        scanner.close();
    }
}
