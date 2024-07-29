package smallApps.shopping;

public class ShoppingItemDriver {
    public static void main(String[] args) {

        ShoppingItem book1 = new Book("the basement","Dostoyevsky","1875");
        ShoppingItem cd1 = new Cd("cd34596","The blues","Warner");

        Transactions.saveTransactionItem(book1);
        Transactions.saveTransactionItem(cd1);


        System.out.println("Iterates fol all the objects");
        Transactions.showTransactions();

        System.out.println("\nIterates fol all the books");
        Transactions.showBookTransactions();

        System.out.println("\nIterates fol all the cds");
        Transactions.showCdTransactions();


    }
}
