import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha, escolha_opcao, respostaCargo;
        String Cargo_selecionado;


        Cargo programador = new Cargo("programador", 3500.00 , "GymPass");
        Cargo Administrador = new Cargo("Administrador", 2500.00 , "Vale alimentação");

        System.out.println("----------------");
        System.out.println("Bem vindo ao sistema de gestão de funcionários. Hoje, vamos gerenciar 2 funcionários.");
        System.out.println("----------------");

        System.out.print("Digite o nome do funcionário 1: ");
        String nomeFuncionario1 = scanner.nextLine();
        Funcionario funcionario1 = new Funcionario(nomeFuncionario1);

        System.out.print("Digite o nome do funcionário 2: ");
        String nomeFuncionario2 = scanner.nextLine();
        Funcionario funcionario2 = new Funcionario(nomeFuncionario2);




        do{
            exibirMenu();
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();
            processar_opcao(escolha, escolha_opcao, funcionario1, funcionario2, programador, Administrador, respostaCargo, Cargo_selecionado, scanner);

        } while (escolha != 0);

        scanner.close();
    }

    private static void processar_opcao(int escolha, int escolha_opcao, Funcionario funcionario1, Funcionario funcionario2,
    Cargo programador, Cargo administrador, int respostaCargo, String Cargo_selecionado, Scanner scanner) {
        switch(escolha){
            case 1:
                System.out.println("Digite '1' para o primeiro funcionário e '2' para o segundo funcionário: ");
                escolha_opcao = scanner.nextInt();

                if (escolha_opcao == 1){
                    escolherCargo(programador, administrador, respostaCargo, Cargo_selecionado);
                    funcionario1.setCargo(Cargo_selecionado);
                } else if (escolha_opcao == 2){

                } else {
                    System.out.println("Escolha inválida de funcionário");
                }



                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                break;
            default:
                System.out.println("Erro na escolha de opções");
                break;
        }
    }

    private static void exibirMenu() {
        System.out.println("----------------");
        System.out.println("Gestão de Funcionários");
        System.out.println("----------------");
        System.out.println("1- Atribuir Cargo para um funcionário");
        System.out.println("2- Registrar horas de trabalho de um funcionário");
        System.out.println("3- Calcular salário de um funcionário");
        System.out.println("4- Criar um departamento");
        System.out.println("0 - Fechar o programa");
        System.out.println("----------------");
    }


    private  static String escolherCargo(Cargo programador, Cargo administrador, int respostaCargo, String Cargo_selecionado){
        do {
            System.out.println("----------------");
            System.out.println("Escolha um cargo: ");
            System.out.println("1." + programador.getNome());
            System.out.println("2." + administrador.getNome());
            respostaCargo = Scanner.nextInt();
        } while (respostaCargo != 1 || respostaCargo != 2);

        if (respostaCargo == 1){
            Cargo = programador.getNome();
        } else if (respostaCargo == 2){
            Cargo = administrador.getNome();
        }

        return Cargo;
    }


}