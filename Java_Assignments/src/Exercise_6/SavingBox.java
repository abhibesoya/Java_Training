package Exercise_6;


public class SavingBox {

    public static void main(String[] args) {

        AddAmount a1 = new AddAmount(50);

        AddAmount a2 = new AddAmount();

        a1.addAmount(100);

        a1.displayAmount();
        a1.showCount();
        a2.displayAmount();

    }

}


class AddAmount {

    int amount = 50;
    int count = 0;

    AddAmount() {
        count++;
    }

    AddAmount(int addAmount) {
        amount = amount + addAmount;
        count++;

    }

    public void addAmount(int number) {
        amount = amount + number;
        count++;
    }

    public void displayAmount() {
        System.out.println("Available balance:" + amount);
    }

    public void showCount() {
        System.out.println("Number of Transactions:" + count);
    }

}


