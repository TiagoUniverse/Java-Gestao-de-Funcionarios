import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha, escolha_opcao, respostaCargo, horas;
        String Cargo_selecionado, nomeDepartamento;

        escolha_opcao = 0;
        respostaCargo = 0;
        horas = 0;
        Cargo_selecionado = "";


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
            processar_opcao(escolha, escolha_opcao, funcionario1, funcionario2,
                    programador, Administrador, respostaCargo, Cargo_selecionado, scanner, horas );
        } while (escolha != 0);

        scanner.close();
    }

    private static void processar_opcao(int escolha, int escolha_opcao, Funcionario funcionario1, Funcionario funcionario2,
    Cargo programador, Cargo administrador, int respostaCargo, String Cargo_selecionado, Scanner scanner, int horas) {
        switch(escolha){
            case 1:
                System.out.println("Digite '1' para o funcionário '" + funcionario1.getNome() + "' e '2' para o funcionário '"+ funcionario2.getNome() +"' : ");
                escolha_opcao = scanner.nextInt();

                //Escolha de funcionario
                if (escolha_opcao == 1){
                    escolherCargo(programador, administrador, Cargo_selecionado, scanner, escolha_opcao, funcionario1, funcionario2);
                } else if (escolha_opcao == 2){
                    escolherCargo(programador, administrador, Cargo_selecionado, scanner, escolha_opcao, funcionario1, funcionario2);
                } else {
                    System.out.println("Escolha inválida de funcionário");
                }

                break;
            case 2:

                System.out.println("Digite '1' para o funcionário '" + funcionario1.getNome() + "' e '2' para o funcionário '"+ funcionario2.getNome() +"' : ");
                escolha_opcao = scanner.nextInt();

                //Escolha de funcionario

                horas = obterHoras();
                if (escolha_opcao == 1){
                    funcionario1.registrarHorasTrabalho(horas);
                } else if (escolha_opcao == 2){
                    funcionario2.registrarHorasTrabalho(horas);
                } else {
                    System.out.println("Escolha inválida de funcionário");
                }

                System.out.println("Horas acrescentadas para o funcionário!");

                break;
            case 3:

                System.out.println("Digite '1' para o funcionário '" + funcionario1.getNome() + "' e '2' para o funcionário '"+ funcionario2.getNome() +"' : ");
                escolha_opcao = scanner.nextInt();

                //Escolha de funcionario
                if (escolha_opcao == 1){
                    funcionario1.calcularSalario(funcionario1.getSalario(), funcionario1.getHorasTrabalho(), funcionario1.getNome());
                } else if (escolha_opcao == 2){
                    funcionario2.calcularSalario(funcionario2.getSalario(), funcionario2.getHorasTrabalho(), funcionario2.getNome());
                } else {
                    System.out.println("Escolha inválida de funcionário");
                }

                break;
            case 4:
                System.out.println("Diga um nome para o departamento");
                String nomeDoDepartamento = scanner.next();
                Departamento departamento = new Departamento(nomeDoDepartamento);
                System.out.println("Departamento " + departamento + " foi criado!");
                break;

            case 0:
                System.out.println("Fechando o programa. Obrigado pelo uso!");
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


    private  static void escolherCargo(Cargo programador, Cargo administrador,
                                         String Cargo_selecionado, Scanner scanner, int escolha_opcao, Funcionario funcionario1, Funcionario funcionario2){
        int respostaCargo;
        System.out.println(escolha_opcao);

        do {
            System.out.println("----------------");
            System.out.println("Escolha um cargo: ");
            System.out.println("1." + programador.getNome());
            System.out.println("2." + administrador.getNome());
            respostaCargo = scanner.nextInt();
        } while (respostaCargo != 1 && respostaCargo != 2);


        if (escolha_opcao == 1){
            //Funcionario 1

            // Escolha de Cargo
            if (respostaCargo == 1){
            funcionario1.setSalario(programador.getSalario_base());
            funcionario1.setCargo(programador.getNome());
            } else if (respostaCargo == 2){
            funcionario1.setSalario(administrador.getSalario_base());
            funcionario1.setCargo(administrador.getNome());
            }
            System.out.println(funcionario1.getNome() + " teve o seu cargo alterado!");

        } else if (escolha_opcao == 2){
            //Funcionario 2
            // Escolha de Cargo
            if (respostaCargo == 1){
                funcionario2.setSalario(programador.getSalario_base());
                funcionario2.setCargo(programador.getNome());
            } else if (respostaCargo == 2){
                funcionario2.setSalario(administrador.getSalario_base());
                funcionario2.setCargo(administrador.getNome());
            }
            System.out.println(funcionario2.getNome() + " teve o seu cargo alterado!");

        }


    }

    private static int obterHoras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantas horas de trabalho este funcionário fez: ");
        return scanner.nextInt();
    }

}