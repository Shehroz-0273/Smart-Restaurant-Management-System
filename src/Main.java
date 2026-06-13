import Menu.MenuData;
import Menu.MenuService;
import Menu.MenuTree;

public class Main {

    public static void main(String[] args) {

        MenuTree menuTree =
                MenuData.createMenu();

        MenuService menuService =
                new MenuService(menuTree);

        menuService.placeOrder();
    }
}