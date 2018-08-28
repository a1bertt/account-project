import org.junit.Assert;
import org.junit.Test;

public class AccountServiceTest {

    @Test
    public void countAccount()
    {
        AccountService accTest = new AccountService();
        accTest.addAccountToMap("Michael", "Jordan", 1);
        accTest.addAccountToMap("Michael", "john", 12);
        accTest.addAccountToMap("James", "john", 123);
        accTest.addAccountToMap("Dave", "Mike", 1234);
        accTest.addAccountToMap("Abs", "Mam", 12345);
        accTest.addAccountToMap("Michael", "Mam", 12349);

        System.out.println(accTest.numberOfAccounts("Michael"));
        Assert.assertEquals(3, accTest.numberOfAccounts("Michael"));
    }
}

