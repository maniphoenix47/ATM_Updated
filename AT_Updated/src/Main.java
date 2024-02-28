public class ATM_1{
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }
    public static void main(String[] args) {
        String cardNumber = "1234567890123456";
        int expiryMonth = 12;
        int expiryYear = 2025;
        String cardType = "Visa";
        {
        boolean isCardValid = verifyCardDetails(cardNumber, expiryMonth, expiryYear, cardType);
        if (isCardValid) {
            System.out.println("Card details are valid.");
        } else {
            System.out.println("Card details are invalid. Payment cannot be processed.");
        }
    }

    private static boolean verifyCardDetails(String cardNumber, int expiryMonth, int expiryYear, String cardType) {
        if (isValidCardNumber(cardNumber) && isExpiryDateValid(expiryMonth, expiryYear) && isValidCardType(cardNumber, cardType)) {
            return true;
        } else {
            return false;
        }
        return true;
    }
    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }
