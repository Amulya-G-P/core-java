class CartExecutor
{
    public static void main(String[] args)
    {
        Cart c1 = new Cart();
        c1.cartId = 1;
		c1.customerName = "Arjun"; 
		c1.numberOfItems = 2;
		c1.totalAmount = 500;

        Cart c2 = new Cart();
        c2.cartId = 2; 
		c2.customerName = "Ravi"; 
		c2.numberOfItems = 1;
		c2.totalAmount = 300;

        Cart c3 = new Cart();
        c3.cartId = 3; 
		c3.customerName = "Kiran"; 
		c3.numberOfItems = 4; 
		c3.totalAmount = 1200;

        Cart c4 = new Cart();
        c4.cartId = 4;
		c4.customerName = "Rahul"; 
		c4.numberOfItems = 3;
		c4.totalAmount = 800;

        Cart c5 = new Cart();
        c5.cartId = 5;
		c5.customerName = "Sneha";
		c5.numberOfItems = 5;
		c5.totalAmount = 1500;

        Cart c6 = new Cart();
        c6.cartId = 6;
		c6.customerName = "Pooja"; 
		c6.numberOfItems = 2;
		c6.totalAmount = 600;

        Cart c7 = new Cart();
        c7.cartId = 7; 
		c7.customerName = "Amit";
		c7.numberOfItems = 1; 
		c7.totalAmount = 250;

        Cart c8 = new Cart();
        c8.cartId = 8; 
		c8.customerName = "Vijay"; 
		c8.numberOfItems = 3;
		c8.totalAmount = 900;

        Cart c9 = new Cart();
        c9.cartId = 9;
		c9.customerName = "Neha";
		c9.numberOfItems = 2;
		c9.totalAmount = 550;

        Cart c10 = new Cart();
        c10.cartId = 10; 
		c10.customerName = "Manoj";
		c10.numberOfItems = 4; 
		c10.totalAmount = 1300;

        Cart c11 = new Cart();
        c11.cartId = 11; 
		c11.customerName = "Suresh"; 
		c11.numberOfItems = 2; 
		c11.totalAmount = 700;

        Cart c12 = new Cart();
        c12.cartId = 12;
		c12.customerName = "Ramesh"; 
		c12.numberOfItems = 3; 
		c12.totalAmount = 950;

        Cart c13 = new Cart();
        c13.cartId = 13; 
		c13.customerName = "Anita"; 
		c13.numberOfItems = 1; 
		c13.totalAmount = 200;

        Cart c14 = new Cart();
        c14.cartId = 14;
		c14.customerName = "Kavya";
		c14.numberOfItems = 5;
		c14.totalAmount = 1600;

        Cart c15 = new Cart();
        c15.cartId = 15; 
		c15.customerName = "Varun"; 
		c15.numberOfItems = 2; 
		c15.totalAmount = 650;

        Cart c16 = new Cart();
        c16.cartId = 16;
		c16.customerName = "Rohit"; 
		c16.numberOfItems = 3;
		c16.totalAmount = 850;

        Cart c17 = new Cart();
        c17.cartId = 17;
		c17.customerName = "Sanjay"; 
		c17.numberOfItems = 4; 
		c17.totalAmount = 1400;

        Cart c18 = new Cart();
        c18.cartId = 18; 
		c18.customerName = "Meena";
		c18.numberOfItems = 2; 
		c18.totalAmount = 500;

        Cart c19 = new Cart();
        c19.cartId = 19; 
		c19.customerName = "Deepak";
		c19.numberOfItems = 3; 
		c19.totalAmount = 1000;

        Cart c20 = new Cart();
        c20.cartId = 20;
		c20.customerName = "Priya"; 
		c20.numberOfItems = 1; 
		c20.totalAmount = 300;


        Order o1 = new Order();
        o1.orderId = 101; 
		o1.productName = "Laptop"; 
		o1.quantity = 1;
		o1.price = 500; 
		o1.orderStatus = "Delivered";

        Order o2 = new Order();
        o2.orderId = 102;
		o2.productName = "Phone";
		o2.quantity = 1; 
		o2.price = 300; 
		o2.orderStatus = "Shipped";

        Order o3 = new Order();
        o3.orderId = 103; 
		o3.productName = "Headphones";
		o3.quantity = 2; 
		o3.price = 600;
		o3.orderStatus = "Delivered";

        Order o4 = new Order();
        o4.orderId = 104;
		o4.productName = "Keyboard"; 
		o4.quantity = 1; 
		o4.price = 200;
		o4.orderStatus = "Processing";

        Order o5 = new Order();
        o5.orderId = 105; 
		o5.productName = "Mouse";
		o5.quantity = 2; 
		o5.price = 300; 
		o5.orderStatus = "Delivered";

        Order o6 = new Order();
        o6.orderId = 106; 
		o6.productName = "Monitor"; 
		o6.quantity = 1; 
		o6.price = 600; 
		o6.orderStatus = "Shipped";

        Order o7 = new Order();
        o7.orderId = 107;
		o7.productName = "Tablet"; 
		o7.quantity = 1; 
		o7.price = 250;
		o7.orderStatus = "Processing";

        Order o8 = new Order();
        o8.orderId = 108;
		o8.productName = "Speaker"; 
		o8.quantity = 2; 
		o8.price = 450; 
		o8.orderStatus = "Delivered";

        Order o9 = new Order();
        o9.orderId = 109; 
		o9.productName = "Camera"; 
		o9.quantity = 1;
		o9.price = 550; 
		o9.orderStatus = "Shipped";

        Order o10 = new Order();
        o10.orderId = 110; 
		o10.productName = "Printer"; 
		o10.quantity = 1;
		o10.price = 400;
		o10.orderStatus = "Delivered";

        Order o11 = new Order();
        o11.orderId = 111;
		o11.productName = "Scanner"; 
		o11.quantity = 1; 
		o11.price = 350; 
		o11.orderStatus = "Processing";

        Order o12 = new Order();
        o12.orderId = 112; 
		o12.productName = "Pendrive"; 
		o12.quantity = 3; 
		o12.price = 150; 
		o12.orderStatus = "Delivered";

        Order o13 = new Order();
        o13.orderId = 113;
		o13.productName = "Hard Disk";
		o13.quantity = 1; 
		o13.price = 700; 
		o13.orderStatus = "Shipped";

        Order o14 = new Order();
        o14.orderId = 114; 
		o14.productName = "Router";
		o14.quantity = 1; 
		o14.price = 300; 
		o14.orderStatus = "Delivered";

        Order o15 = new Order();
        o15.orderId = 115;
		o15.productName = "Smart Watch"; 
		o15.quantity = 1; 
		o15.price = 650; 
		
		o15.orderStatus = "Processing";
        Order o16 = new Order();
        o16.orderId = 116; 
		o16.productName = "Charger"; 
		o16.quantity = 2; 
		o16.price = 200; 
		o16.orderStatus = "Delivered";

        Order o17 = new Order();
        o17.orderId = 117; 
		o17.productName = "Power Bank"; 
		o17.quantity = 1; 
		o17.price = 400;
		o17.orderStatus = "Shipped";

        Order o18 = new Order();
        o18.orderId = 118;
		o18.productName = "USB Cable"; 
		o18.quantity = 3; 
		o18.price = 150;
		o18.orderStatus = "Delivered";

        Order o19 = new Order();
        o19.orderId = 119;
		o19.productName = "Webcam"; 
		o19.quantity = 1;
		o19.price = 500;
		o19.orderStatus = "Processing";

        Order o20 = new Order();
        o20.orderId = 120; 
		o20.productName = "Microphone"; 
		o20.quantity = 1; 
		o20.price = 300;
		o20.orderStatus = "Delivered";


        c1.order = o1; 
		c1.getCartDetails();
        c2.order = o2; 
		c2.getCartDetails();
        c3.order = o3; 
		c3.getCartDetails();
        c4.order = o4; 
		c4.getCartDetails();
        c5.order = o5; 
		c5.getCartDetails();
        c6.order = o6; 
		c6.getCartDetails();
        c7.order = o7; 
		c7.getCartDetails();
        c8.order = o8; 
		c8.getCartDetails();
        c9.order = o9; 
		c9.getCartDetails();
        c10.order = o10; 
		c10.getCartDetails();
        c11.order = o11; 
		c11.getCartDetails();
        c12.order = o12; 
		c12.getCartDetails();
        c13.order = o13; 
		c13.getCartDetails();
        c14.order = o14; 
		c14.getCartDetails();
        c15.order = o15;
		c15.getCartDetails();
        c16.order = o16; 
		c16.getCartDetails();
        c17.order = o17; 
		c17.getCartDetails();
        c18.order = o18; 
		c18.getCartDetails();
        c19.order = o19; 
		c19.getCartDetails();
        c20.order = o20;
		c20.getCartDetails();
    }
}