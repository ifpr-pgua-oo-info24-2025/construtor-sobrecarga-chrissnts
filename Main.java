import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int op;

        Carro car = null; 
        Condutor driver = null;
        Motor engine = null;

        do {
            System.out.println("\n");
            System.out.println("1. Adicionar Condutor");
            System.out.println("2. Adicionar Motor");
            System.out.println("3. Adicionar Veiculo");
            System.out.println("4. Exibir Informacoes");
            System.out.println("5. Trocar Condutor");
            System.out.println("6. Trocar Motor");
            System.out.println("0. Sair");
            op = scan.nextInt();
            scan.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("\nDigite o nome do condutor:");
                    String nome = scan.nextLine();
                    System.out.println("\nDigite o CNH do condutor:");
                    String cnh = scan.nextLine();
                    driver = new Condutor(nome, cnh);
                    System.out.println("\nCondutor criado com sucesso.");
                    break;

                case 2:
                    System.out.println("\nDigite o tipo do motor (1 - Gasolina, 2 - Eletrico, 3 - Diesel):");
                    int tipoMotor = scan.nextInt();
                    scan.nextLine();

                    System.out.println("\nDigite a potencia do motor:");
                    int potenciaMotor = scan.nextInt();
                    scan.nextLine();

                    engine = new Motor(tipoMotor, potenciaMotor);
                    System.out.println("\nMotor criado com sucesso.");
                    break;

                case 3:
                    System.out.println("\nDigite a marca do veiculo:");
                    String marca = scan.nextLine();
                    System.out.println("\nDigite o modelo do veiculo:");
                    String modelo = scan.nextLine();
                    System.out.println("\nDigite a placa do veiculo:");
                    String placa = scan.nextLine();

                    car = new Carro(marca, modelo, placa, engine, driver);
                    System.out.println("\nVeiculo criado com sucesso.");
                    break;

                case 4:
                    if (car != null) {
                        System.out.println(car.toString());
                    } else {
                        System.out.println("\nNenhum veiculo foi cadastrado ainda.");
                    }
                    break;

                case 5:
                    if (car != null) {
                        System.out.println("\nDigite o nome do novo condutor:");
                        String nomeNovo = scan.nextLine();
                        System.out.println("\nDigite o CNH do novo condutor:");
                        String cnhNova = scan.nextLine();
                        Condutor novoCondutor = new Condutor(nomeNovo, cnhNova);
                        System.out.println(car.trocarCondutor(novoCondutor));
                    } else {
                        System.out.println("\nCrie um veiculo primeiro.");
                    }
                    break;

                case 6:
                    if (car != null) {
                        System.out.println("\nDigite o tipo do novo motor (1 - Gasolina, 2 - Eletrico, 3 - Diesel):");
                        int tipoNovo = scan.nextInt();
                        scan.nextLine();
                        System.out.println("\nDigite a potencia:");
                        int potenciaNova = scan.nextInt();
                        scan.nextLine();
                        Motor novoMotor = new Motor(tipoNovo, potenciaNova);
                        System.out.println(car.trocarMotor(novoMotor));
                    } else {
                        System.out.println("\nCrie um veiculo primeiro.");
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nOpcao invalida.");
            }

        } while (op != 0);

        scan.close();
    }
}