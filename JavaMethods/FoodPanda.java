class FoodPanda
{
    static double search(String itemName)
    {
        double price = 0;

        if(itemName == "Ramen") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Udon Noodles") {
            price = 170.0;
            return price;
        }
        else if(itemName == "Soba Noodles") {
            price = 165.0;
            return price;
        }
        else if(itemName == "Tempura") {
            price = 190.0;
            return price;
        }
        else if(itemName == "Takoyaki") {
            price = 160.0;
            return price;
        }
        else if(itemName == "Okonomiyaki") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Katsu Curry") {
            price = 200.0;
            return price;
        }
        else if(itemName == "Chicken Katsu") {
            price = 190.0;
            return price;
        }
        else if(itemName == "Tonkatsu") {
            price = 210.0;
            return price;
        }
        else if(itemName == "Onigiri") {
            price = 90.0;
            return price;
        }
        else if(itemName == "Tamago Sushi") {
            price = 120.0;
            return price;
        }
        else if(itemName == "Ebi Sushi") {
            price = 140.0;
            return price;
        }
        else if(itemName == "Salmon Sushi") {
            price = 160.0;
            return price;
        }
        else if(itemName == "Tuna Sushi") {
            price = 170.0;
            return price;
        }
        else if(itemName == "Matcha Cake") {
            price = 150.0;
            return price;
        }
        else if(itemName == "Mochi") {
            price = 130.0;
            return price;
        }
        else if(itemName == "Dorayaki") {
            price = 120.0;
            return price;
        }
        else if(itemName == "Crepe") {
            price = 110.0;
            return price;
        }
        else if(itemName == "Wonton Soup") {
            price = 100.0;
            return price;
        }
        else if(itemName == "Dumplings") {
            price = 140.0;
            return price;
        }
        else if(itemName == "Bao Bun") {
            price = 150.0;
            return price;
        }
        else if(itemName == "Peking Duck") {
            price = 280.0;
            return price;
        }
        else if(itemName == "Kung Pao Shrimp") {
            price = 220.0;
            return price;
        }
        else if(itemName == "Mapo Tofu") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Fried Dumplings") {
            price = 150.0;
            return price;
        }
        else if(itemName == "Steamed Dumplings") {
            price = 140.0;
            return price;
        }
        else if(itemName == "Hot Pot") {
            price = 300.0;
            return price;
        }
        else if(itemName == "Bibimbap") {
            price = 200.0;
            return price;
        }
        else if(itemName == "Kimchi Fried Rice") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Bulgogi") {
            price = 240.0;
            return price;
        }
        else if(itemName == "Tteokbokki") {
            price = 160.0;
            return price;
        }
        else if(itemName == "Japchae") {
            price = 190.0;
            return price;
        }
        else if(itemName == "Samgyeopsal") {
            price = 260.0;
            return price;
        }
        else if(itemName == "Korean Fried Chicken") {
            price = 220.0;
            return price;
        }
        else if(itemName == "Pho") {
            price = 170.0;
            return price;
        }
        else if(itemName == "Banh Mi") {
            price = 150.0;
            return price;
        }
        else if(itemName == "Spring Roll Rice Paper") {
            price = 140.0;
            return price;
        }
        else if(itemName == "Pad Thai") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Green Curry") {
            price = 200.0;
            return price;
        }
        else if(itemName == "Red Curry") {
            price = 200.0;
            return price;
        }
        else if(itemName == "Tom Yum Soup") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Tom Kha Soup") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Thai Basil Chicken") {
            price = 210.0;
            return price;
        }
        else if(itemName == "Massaman Curry") {
            price = 220.0;
            return price;
        }
        else if(itemName == "Pineapple Fried Rice") {
            price = 190.0;
            return price;
        }
        else if(itemName == "Satay Chicken") {
            price = 200.0;
            return price;
        }
        else if(itemName == "Laksa") {
            price = 210.0;
            return price;
        }
        else if(itemName == "Nasi Goreng") {
            price = 180.0;
            return price;
        }
        else if(itemName == "Mee Goreng") {
            price = 170.0;
            return price;
        }
        else if(itemName == "Hainanese Chicken Rice") {
            price = 200.0;
            return price;
        }
        else if(itemName == "Char Kway Teow") {
            price = 190.0;
            return price;
        }
        else if(itemName == "Roti Canai") {
            price = 120.0;
            return price;
        }
        else if(itemName == "Teh Tarik") {
            price = 80.0;
            return price;
        }
        else if(itemName == "Cendol") {
            price = 100.0;
            return price;
        }
        else if(itemName == "Ice Kachang") {
            price = 110.0;
            return price;
        }
        else {
            System.out.println("Item not found");
            return price;
        }
    }
    static double search(String itemName, int quantity)
    {
        double price = 0;

        if(itemName == "Ramen") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Udon Noodles") {
            price = 170.0;
            return price * quantity;
        }
        else if(itemName == "Soba Noodles") {
            price = 165.0;
            return price * quantity;
        }
        else if(itemName == "Tempura") {
            price = 190.0;
            return price * quantity;
        }
        else if(itemName == "Takoyaki") {
            price = 160.0;
            return price * quantity;
        }
        else if(itemName == "Okonomiyaki") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Katsu Curry") {
            price = 200.0;
            return price * quantity;
        }
        else if(itemName == "Chicken Katsu") {
            price = 190.0;
            return price * quantity;
        }
        else if(itemName == "Tonkatsu") {
            price = 210.0;
            return price * quantity;
        }
        else if(itemName == "Onigiri") {
            price = 90.0;
            return price * quantity;
        }
        else if(itemName == "Tamago Sushi") {
            price = 120.0;
            return price * quantity;
        }
        else if(itemName == "Ebi Sushi") {
            price = 140.0;
            return price * quantity;
        }
        else if(itemName == "Salmon Sushi") {
            price = 160.0;
            return price * quantity;
        }
        else if(itemName == "Tuna Sushi") {
            price = 170.0;
            return price * quantity;
        }
        else if(itemName == "Matcha Cake") {
            price = 150.0;
            return price * quantity;
        }
        else if(itemName == "Mochi") {
            price = 130.0;
            return price * quantity;
        }
        else if(itemName == "Dorayaki") {
            price = 120.0;
            return price * quantity;
        }
        else if(itemName == "Crepe") {
            price = 110.0;
            return price * quantity;
        }
        else if(itemName == "Wonton Soup") {
            price = 100.0;
            return price * quantity;
        }
        else if(itemName == "Dumplings") {
            price = 140.0;
            return price * quantity;
        }
        else if(itemName == "Bao Bun") {
            price = 150.0;
            return price * quantity;
        }
        else if(itemName == "Peking Duck") {
            price = 280.0;
            return price * quantity;
        }
        else if(itemName == "Kung Pao Shrimp") {
            price = 220.0;
            return price * quantity;
        }
        else if(itemName == "Mapo Tofu") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Fried Dumplings") {
            price = 150.0;
            return price * quantity;
        }
        else if(itemName == "Steamed Dumplings") {
            price = 140.0;
            return price * quantity;
        }
        else if(itemName == "Hot Pot") {
            price = 300.0;
            return price * quantity;
        }
        else if(itemName == "Bibimbap") {
            price = 200.0;
            return price * quantity;
        }
        else if(itemName == "Kimchi Fried Rice") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Bulgogi") {
            price = 240.0;
            return price * quantity;
        }
        else if(itemName == "Tteokbokki") {
            price = 160.0;
            return price * quantity;
        }
        else if(itemName == "Japchae") {
            price = 190.0;
            return price * quantity;
        }
        else if(itemName == "Samgyeopsal") {
            price = 260.0;
            return price * quantity;
        }
        else if(itemName == "Korean Fried Chicken") {
            price = 220.0;
            return price * quantity;
        }
        else if(itemName == "Pho") {
            price = 170.0;
            return price * quantity;
        }
        else if(itemName == "Banh Mi") {
            price = 150.0;
            return price * quantity;
        }
        else if(itemName == "Spring Roll Rice Paper") {
            price = 140.0;
            return price * quantity;
        }
        else if(itemName == "Pad Thai") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Green Curry") {
            price = 200.0;
            return price * quantity;
        }
        else if(itemName == "Red Curry") {
            price = 200.0;
            return price * quantity;
        }
        else if(itemName == "Tom Yum Soup") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Tom Kha Soup") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Thai Basil Chicken") {
            price = 210.0;
            return price * quantity;
        }
        else if(itemName == "Massaman Curry") {
            price = 220.0;
            return price * quantity;
        }
        else if(itemName == "Pineapple Fried Rice") {
            price = 190.0;
            return price * quantity;
        }
        else if(itemName == "Satay Chicken") {
            price = 200.0;
            return price * quantity;
        }
        else if(itemName == "Laksa") {
            price = 210.0;
            return price * quantity;
        }
        else if(itemName == "Nasi Goreng") {
            price = 180.0;
            return price * quantity;
        }
        else if(itemName == "Mee Goreng") {
            price = 170.0;
            return price * quantity;
        }
        else if(itemName == "Hainanese Chicken Rice") {
            price = 200.0;
            return price * quantity;
        }
        else if(itemName == "Char Kway Teow") {
            price = 190.0;
            return price * quantity;
        }
        else if(itemName == "Roti Canai") {
            price = 120.0;
            return price * quantity;
        }
        else if(itemName == "Teh Tarik") {
            price = 80.0;
            return price * quantity;
        }
        else if(itemName == "Cendol") {
            price = 100.0;
            return price * quantity;
        }
        else if(itemName == "Ice Kachang") {
            price = 110.0;
            return price * quantity;
        }
        else {
            System.out.println("Item not found");
            return price * quantity;
        }
    }
}
