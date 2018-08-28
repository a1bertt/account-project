import java.util.HashMap;
import java.util.Map;

public class AccountService
{
    private Map<Integer, Account> accountMap;
    Integer counter = 1;

    public AccountService()
    {
        counter = 1;
        accountMap = new HashMap<Integer, Account>();
    }

    public void addAccountToMap(String firstName, String lastName, int accountNumber)
    {
        Account newAccount = new Account(firstName, lastName, accountNumber);
        accountMap.put(counter, newAccount);
        counter++;
    }

    public Account getAccountFromMap(Integer accountToGet)
    {
        return accountMap.get(accountToGet);
    }
}
