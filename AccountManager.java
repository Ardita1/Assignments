/**Kjo klase permaban dy llogari bankare */
/**Autor: Ardita Morina  */
public class AccountManager

{ public static void main(String[] args)
{ BankReader a = new BankReader();


BankAccount kontoja_e_pare = new BankAccount(0);
BankWriter a1= new BankWriter("Kontoja e pare ", kontoja_e_pare);
BankAccount kontoja_e_dyte = new BankAccount(0);
BankWriter a2 = new BankWriter("Kontoja e dyte", kontoja_e_dyte);

AccountController bankieri = new AccountController(a,kontoja_e_pare, a1,kontoja_e_dyte,a2);
bankieri.procesi_i_transaksionit();
}
}