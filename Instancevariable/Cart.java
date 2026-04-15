class Cart
{
    int cartId;
    String customerName;
    int numberOfItems;
    double totalAmount;
    Order order;

    public void getCartDetails()
    {
        System.out.println("Cart Id: " + cartId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Number Of Items: " + numberOfItems);
        System.out.println("Total Amount: " + totalAmount);

        order.getOrderDetails();
    }
}