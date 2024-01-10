package try2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    ArrayList<Menu> menuList = new ArrayList<>();
    ArrayList<Product> burgerList = new ArrayList<>();
    ArrayList<Product> drinkList = new ArrayList<>();
    ArrayList<Product> beerList = new ArrayList<>();
    Order order = new Order();
    Scanner scanner = new Scanner(System.in);

    public void LoadMenu() {
        menuList.add(new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"));
        menuList.add(new Menu("Drinks", "매장에서 직접 만드는 음료"));
        menuList.add(new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주"));

        burgerList.add(new Product("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgerList.add(new Product("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgerList.add(new Product("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        drinkList.add(new Product("Water", 1.0, "갈증날 땐 물!"));
        drinkList.add(new Product("Coke", 2.0, "햄버거엔 콜라!"));
        drinkList.add(new Product("LemonAde", 4.0, "그냥 콜라마셔라"));

        beerList.add(new Product("SaegMak", 5.0, "생맥"));
        beerList.add(new Product("Cass", 4.0, "카스"));
        beerList.add(new Product("Tera", 4.0, "테라"));
    }

    public void Kioskmenu() {
        showIntro();
        showMenu();
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Order    |   장나구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel   |   진행중인 주문을 취소합니다.\n");
        System.out.print("메뉴를 선택해주세요: ");
        int menuChoice = scanner.nextInt();
        scanner.nextLine();

        switch (menuChoice) {
            case 1:
                showBurgerMenu();
                break;
            case 2:
                showDrinkMenu();
                break;
            case 3:
                showBeerMenu();
                break;
            case 4:
                showOrderMenu();
                break;
            case 5:
                orderCancel();
                break;
            default:
                System.out.println("1 ~ 6까지의 숫자만 입력가능합니다.");
                break;
        }
    }

    public void showIntro() { // 인삿말
        System.out.println();
        System.out.println("======================================");
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
    }

    public void showMenu() { // 메뉴타이플 선택
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuList.size(); i++) {
            Menu menu = menuList.get(i);
            System.out.print((i + 1) + ". ");
            System.out.printf("%-15s  |  %s", menu.getName(), menu.getDetail());
            System.out.println();
        }
    }

    public void showBurgerMenu() { // 버거 리스트 출력
        showIntro();
        System.out.println("[ Burgers Menu ]");
        for (int i = 0; i < burgerList.size(); i++) {
            Product product = burgerList.get(i);
            System.out.print((i + 1) + ". ");
            System.out.printf("%-15s | %s | %s", product.getName(), product.getPrice(), product.getDetail());
            System.out.println();
        }

        System.out.println();
        System.out.print("메뉴 선택: ");
        int burgerChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int burgerInfo = burgerChoice - 1;
        Product selectBurger = burgerList.get(burgerInfo);
        System.out.println("\" " + selectBurger.getName() + "    | W " + selectBurger.getPrice() + " | " + selectBurger.getDetail() + " \"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인     2. 취소\n");

        System.out.print("메뉴 선택: ");
        int check = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (check == 1) {
            order.addBasket(selectBurger);
            System.out.println(selectBurger.getName() + " 가 장바구니에 추가되었습니다.");
            System.out.println();
        } else if (check == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.");
        } else {
            System.out.println("잘못된 숫자를 입력하셨습니다.");
        }
        Kioskmenu();

    }


    public void showDrinkMenu() { // 음료 리스트 출력
        showIntro();
        System.out.println("[ Drinks Menu ]");
        for (int i = 0; i < drinkList.size(); i++) {
            Product product = drinkList.get(i);
            System.out.print((i + 1) + ". ");
            System.out.printf("%-15s | %s | %s", product.getName(), product.getPrice(), product.getDetail());
            System.out.println();
        }

        System.out.println();
        System.out.print("메뉴 선택: ");
        int drinkChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int drinkInfo = drinkChoice - 1;
        Product selectDrink = drinkList.get(drinkInfo);
        System.out.println("\" " + selectDrink.getName() + "    | W " + selectDrink.getPrice() + " | " + selectDrink.getDetail() + " \"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인     2. 취소\n");

        System.out.print("메뉴 선택: ");
        int check = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (check == 1) {
            order.addBasket(selectDrink);
            System.out.println(selectDrink.getName() + " 가 장바구니에 추가되었습니다.");
            System.out.println();
        } else if (check == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.");
        } else {
            System.out.println("잘못된 숫자를 입력하셨습니다.");
        }
        Kioskmenu();
    }


    public void showBeerMenu() { // 비어 리스트 출력
        showIntro();
        System.out.println("[ Beers Menu ]");
        for (int i = 0; i < beerList.size(); i++) {
            Product product = beerList.get(i);
            System.out.print((i + 1) + ". ");
            System.out.printf("%-15s | %s | %s", product.getName(), product.getPrice(), product.getDetail());
            System.out.println();
        }

        System.out.println();
        System.out.print("메뉴 선택: ");
        int beerChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int beerInfo = beerChoice - 1;
        Product selcetBeer = beerList.get(beerInfo);
        System.out.println("\" " + selcetBeer.getName() + "    | W " + selcetBeer.getPrice() + " | " + selcetBeer.getDetail() + " \"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인     2. 취소\n");

        System.out.print("메뉴 선택: ");
        int check = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (check == 1) {
            order.addBasket(selcetBeer);
            System.out.println(selcetBeer.getName() + " 가 장바구니에 추가되었습니다.");
            System.out.println();
        } else if (check == 2) {
            System.out.println("장바구니 추가가 취소되었습니다.");
        } else {
            System.out.println("잘못된 숫자를 입력하셨습니다.");
        }
        Kioskmenu();
    }
    public void showOrderMenu() {
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");

        ArrayList<Product> basket = order.getBasket();

        for (int i = 0; i < basket.size(); i++) {
            Product menu = basket.get(i);
            System.out.println("\" " + menu.getName() + "    | W " + menu.getPrice() + " | " + menu.getDetail() + " \"");
        }

        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + order.totalPrice());
        System.out.println();
        System.out.println("1. 주문      2. 메뉴판\n");
        System.out.print("메뉴 선택: ");
        int check = scanner.nextInt();
        scanner.nextLine();

        if (check == 1) {
            orderComplete();
        } else if (check == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
            Kioskmenu();
        }
    }

    public void orderComplete() {
        int orderNumber = order.getOrderNumber();
        System.out.println("주문이 완료되었습니다.\n");
        System.out.println("대기번호는 [ " + orderNumber + " ] 번 입니다.");
        System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        order.clearBasket();
        order.setOrderNumber(orderNumber + 1);
        Kioskmenu();
    }

    public void orderCancel() {
        System.out.println();
        System.out.println("진행하던 주문을 취소하시겠습니까?\n");
        System.out.println("1. 확인      2. 취소\n");
        System.out.print("메뉴 선택:");
        int cancelNum = scanner.nextInt();
        scanner.nextLine();

        if (cancelNum == 1) {
            order.clearBasket();
            System.out.println("\n진행하던 주문이 취소되었습니다.\n");
        } else if (cancelNum == 2) {
            System.out.println("\n주문을 유지하고 메뉴판으로 돌아갑니다.");
        }

        Kioskmenu();
    }
}