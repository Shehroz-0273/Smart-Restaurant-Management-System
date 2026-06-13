package Menu;

public class MenuData {

    public static MenuTree createMenu() {

        MenuTree menuTree = new MenuTree();

        TreeNode fastFood = new TreeNode("Fast Food");
        TreeNode drinks = new TreeNode("Cold Drinks");
        TreeNode desserts = new TreeNode("Desserts");

        // =========================
        // PIZZA
        // =========================

        Menu_Item pizza = new Menu_Item("Pizza");

        pizza.addFlavour("Chicken Fajita");
        pizza.addFlavour("Chicken Tikka");
        pizza.addFlavour("Pepperoni");
        pizza.addFlavour("BBQ Chicken");
        pizza.addFlavour("Malai Boti");
        pizza.addFlavour("Seekh Kebab");
        pizza.addFlavour("Cheese Lover");
        pizza.addFlavour("Veggie Supreme");
        pizza.addFlavour("Chicken Supreme");
        pizza.addFlavour("Hot & Spicy");
        pizza.addFlavour("Mexican");
        pizza.addFlavour("Crown Crust");
        pizza.addFlavour("Stuffed Crust");
        pizza.addFlavour("Arabian Ranch");
        pizza.addFlavour("Chicken Extreme");

        pizza.addSize("Small", 799);
        pizza.addSize("Medium", 1299);
        pizza.addSize("Large", 1899);
        pizza.addSize("Family", 2499);

        fastFood.addChild(new TreeNode(pizza));

        // =========================
        // BURGER
        // =========================

        Menu_Item burger = new Menu_Item("Burger");

        burger.addFlavour("Zinger Burger");
        burger.addFlavour("Beef Burger");
        burger.addFlavour("Chicken Burger");
        burger.addFlavour("Double Patty Burger");
        burger.addFlavour("Jalapeno Burger");
        burger.addFlavour("Mighty Burger");
        burger.addFlavour("Grilled Chicken Burger");
        burger.addFlavour("Cheese Burger");

        burger.addSize("Regular", 450);
        burger.addSize("Large", 650);

        fastFood.addChild(new TreeNode(burger));

        // =========================
        // SHAWARMA
        // =========================

        Menu_Item shawarma = new Menu_Item("Shawarma");

        shawarma.addFlavour("Chicken Shawarma");
        shawarma.addFlavour("Zinger Shawarma");
        shawarma.addFlavour("Cheese Shawarma");
        shawarma.addFlavour("Arabic Shawarma");
        shawarma.addFlavour("Mexican Shawarma");
        shawarma.addFlavour("Special Shawarma");

        shawarma.addSize("Regular", 250);
        shawarma.addSize("Large", 400);

        fastFood.addChild(new TreeNode(shawarma));

        // =========================
        // PASTA
        // =========================

        Menu_Item pasta = new Menu_Item("Pasta");

        pasta.addFlavour("Alfredo Pasta");
        pasta.addFlavour("Arrabiata Pasta");
        pasta.addFlavour("Creamy Chicken Pasta");

        pasta.addSize("Regular", 650);
        pasta.addSize("Large", 950);

        fastFood.addChild(new TreeNode(pasta));

        // =========================
        // LOADED FRIES
        // =========================

        Menu_Item fries = new Menu_Item("Loaded Fries");

        fries.addFlavour("Cheese Fries");
        fries.addFlavour("Pizza Fries");
        fries.addFlavour("Mexican Fries");

        fries.addSize("Regular", 350);
        fries.addSize("Large", 550);

        fastFood.addChild(new TreeNode(fries));

        // =========================
        // DRINKS
        // =========================

        String[] drinksList = {
                "Pepsi",
                "7UP",
                "Mirinda",
                "Mountain Dew",
                "Coca Cola",
                "Sprite",
                "Fanta",
                "Fresh Lime",
                "Mint Margarita",
                "Mineral Water"
        };

        for(String drink : drinksList) {

            Menu_Item d = new Menu_Item(drink);

            d.addSize("Regular", 120);
            d.addSize("Large", 180);

            drinks.addChild(new TreeNode(d));
        }

        // =========================
        // DESSERTS
        // =========================

        String[] dessertList = {
                "Chocolate Cake",
                "Red Velvet Cake",
                "Vanilla Ice Cream",
                "Chocolate Ice Cream",
                "Brownie"
        };

        for(String dessert : dessertList) {

            Menu_Item d = new Menu_Item(dessert);

            d.addSize("Standard", 300);

            desserts.addChild(new TreeNode(d));
        }

        // Add Categories To Root

        menuTree.getRoot().addChild(fastFood);
        menuTree.getRoot().addChild(drinks);
        menuTree.getRoot().addChild(desserts);

        return menuTree;
    }
}