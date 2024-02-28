    import java.util.Scanner;

    public class contaCorrenteMain {
        public static class Main {
            public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
                    System.out.print("Digite o nome do titular da conta: ");
                    String nomeTitular = scanner.nextLine();

                    System.out.print("Digite o número da conta: ");
                    int numeroConta = Integer.parseInt(scanner.nextLine());

                    System.out.print("Digite o email do titular da conta: ");
                    String email = scanner.nextLine();

                    System.out.print("Digite o telefone do titular da conta: ");
                    String telefone = scanner.nextLine();

                    ContaCorrente conta = new ContaCorrente(nomeTitular, numeroConta, email, telefone);

                    while (true) {
                        System.out.print("\nEscolha uma operação:\n" +
                                "1 - Depósito\n" +
                                "2 - Saque\n" +
                                "3 - Transferência\n" +
                                "4 - Sair\n" +
                                "\nOpção escolhida: ");
                        int opcao = Integer.parseInt(scanner.nextLine());

                        switch (opcao) {
                            case 1: {
                                System.out.print("Digite o valor do depósito: ");
                                double valorDeposito = Double.parseDouble(scanner.nextLine());
                                conta.depositar(valorDeposito);
                                break;
                            }
                            case 2: {
                                System.out.print("Digite o valor do saque: ");
                                double valorSaque = Double.parseDouble(scanner.nextLine());
                                conta.sacar(valorSaque);
                                break;
                                
                            }
                            case 3: {
                                System.out.print("Digite o número da conta destino: ");
                                int numeroContaDestino = Integer.parseInt(scanner.nextLine());
                                ContaCorrente contaDestino = new ContaCorrente("Destinatário", numeroContaDestino, "", "");

                                System.out.print("Digite o valor da transferência: ");
                                double valorTransferencia = Double.parseDouble(scanner.nextLine());
                                conta.transferir(contaDestino, valorTransferencia);
                                break;
                                
                            }
                            case 4: {
                                System.exit(0);
                                break;
                            }
                            default: {
                                System.out.println("Opção inválida!");
                                break;
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
