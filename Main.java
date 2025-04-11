import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Main {
    public static void main(String[] args) {
        Carro car = new Carro();
        Condutor driver = new Condutor(null, null);
        Motor engine = new Motor(null, 0);
        Scanner scan = new Scanner(System.in);

        String modelo, marca, placa;
        Motor motor;
        int op;

        do {

            System.out.println("\n");
            System.out.println("1. Adicionar Condutor");
            System.out.println("2. Adicionar Motor");
            System.out.println("2. Adicionar Veiculo");
            System.out.println("0. Sair");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("\nDigite o nome do condutor:");
                    driver.setNome(scan.nextLine());
                    System.out.println("\nDigite o CNH do condutor: ");
                    driver.setCnh(scan.nextLine());
                break;

                case 2:
                    System.out.println("\nDigite o tipo do motor ( 1 - Gasolina, 2 - Eletrico, 3 - Diesel): ");
                    engine.setTipo(scan.nextInt());
                    System.out.println("\nDigite a potencia do motor: ");
                    engine.setPotencia(scan.nextInt());
                break;

                case 3:
                    System.out.println("Digite");
            }

        } while (op != 0);

    }
}
