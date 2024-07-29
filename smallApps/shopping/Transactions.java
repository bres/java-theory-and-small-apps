package smallApps.shopping;

public class Transactions {

    //fields
    private static ShoppingItem[] transactions = new ShoppingItem[100];
    private static int pivot = 0;

    public static void saveTransactionItem(ShoppingItem shoppingItem) {
        transactions[pivot++] = shoppingItem; //post increment0
    }
    public static void showTransactions(){
        for (ShoppingItem iterator:transactions) {
            if (iterator!=null)
            System.out.println(iterator);
        }
    }
    //check if the object is a book and print only those
    public static void showBookTransactions(){
        for (ShoppingItem iterator:transactions) {
            if (iterator instanceof Book)
                System.out.println(iterator);
        }
    }

    //check if the object is a cd and print only those
    public static void showCdTransactions(){
        for (ShoppingItem iterator:transactions) {
            if (iterator instanceof Cd)
                System.out.println(iterator);
        }
    }
}

