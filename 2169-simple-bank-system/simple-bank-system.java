class Bank {
    private long[] account_balance;
    private int total_accounts;

    public Bank(long[] balance) {
        this.account_balance = balance;
        this.total_accounts = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 < 1 || account1 > total_accounts ||
            account2 < 1 || account2 > total_accounts ||
            account_balance[account1 - 1] < money) {
            return false;
        }
        account_balance[account1 - 1] -= money;
        account_balance[account2 - 1] += money;
        return true;
    }

    public boolean deposit(int account, long money) {
        if (account < 1 || account > total_accounts) {
            return false;
        }
        account_balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account < 1 || account > total_accounts ||
            account_balance[account - 1] < money) {
            return false;
        }
        account_balance[account - 1] -= money;
        return true;
    }
}

   

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */