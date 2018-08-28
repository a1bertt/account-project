public class app {

    public static void main(String [ ] args)
    {
        System.out.println("Hello World!");

        AccountService acc = new AccountService();
        acc.addAccountToMap("Michael", "Jordan", 1);
        acc.getAccountFromMap(1);

        System.out.println(acc.getAccountFromMap(1).toString());
    }
}
