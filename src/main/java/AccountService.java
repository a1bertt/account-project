import org.json.JSONObject;

import java.util.HashMap;
import java.util.Iterator;
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

    public JSONObject convertMapToJSON()
    {
        return new JSONObject(accountMap);
    }

    public int numberOfAccounts(String firstName)
    {
        int instances = 0;

        for(int i=1; i <= accountMap.size(); i++)
        {
            String fName =  accountMap.get(i).getFirstName();
            if(fName.equals(firstName))
            {
                instances++;
            }
        }
        return instances;
    }
}
