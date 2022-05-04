public class Main {
    public static void main(String[] args) {

        User user = new User();
        Account account = new Account();

        account.setUserName("Bianca25");
        account.setPassword("BiaMaria10");

        user.setAccount(account);

        user.setOrder(new Order("Apple"));
        user.setOrder(new Order("Banana"));
        user.setOrder(new Order("Cherry"));

        user.showAllOrders();
        user.makeReturn(2);
        user.showSpecificOrder(2);

        user.addToWishList("Carrots");
        user.addToWishList("Tomatoes");
        user.addToWishList("Potatoes");

        user.viewWishList();

        System.out.println(user);

    }
}


