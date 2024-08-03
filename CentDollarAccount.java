public class CentDollarAccount {
    int Balance;
    public CentDollarAccount(CentDollar cent) {
        Balance = cent.getCentDollarAmount();
        System.out.println(Balance);
    }
}
