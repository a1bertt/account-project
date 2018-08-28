import org.json.JSONObject;

public class app {

    public static void main(String [ ] args)
    {
        System.out.println("Hello World!");

        AccountService acc = new AccountService();
        acc.addAccountToMap("Michael", "Jordan", 1);
        acc.addAccountToMap("Michael", "john", 231);
        acc.addAccountToMap("James", "john", 23211);
        acc.addAccountToMap("Dave", "Mike", 2322311);
        acc.addAccountToMap("Abs", "Mam", 12);
        acc.getAccountFromMap(1);

        //System.out.println(acc.getAccountFromMap(1).toString());
        //System.out.println(acc.convertMapToJSON());
        System.out.println(acc.numberOfAccounts("Michael"));
    }
}
