import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try{
            System.out.println("Bem vindo(a), ao BancoX. Para entrar em sua conta, insira as informações necessárias:" );

            System.out.println("Digite o número da Agência: ");
            int agencyNum = scanner.nextInt();

            System.out.println("Digite o nome completo vinculado à conta: ");
            String accountName = scanner.next();
            String accountName1 = scanner.nextLine();

            System.out.println("Digite o Número da conta, com o hífen: ");
            String accountNum = scanner.next();

            scanner.close();

            float randomBalance = random.nextFloat()*5001;
            String number = String.format("%.2f",randomBalance);

            System.out.println("Olá "+accountName+accountName1+", obrigado por criar uma conta em nosso banco, sua agência é "+agencyNum+", conta "+accountNum+" e seu saldo de "+number+" já está disponível para saque.");
        } catch (Exception e) {
            System.out.println("Letras em campos numéricos não são permitidos! Encerrando tentativa de login.");;
        }



    }
}
