package try2;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

    ArrayList<Menu> menuList = new ArrayList<>(); // 메인메뉴 리스트
    ArrayList<Product> burgerList = new ArrayList<>(); // 버거 리스트 생성
    ArrayList<Product> drinkList = new ArrayList<>(); // 음료 리스트 생성
    ArrayList<Product> beerList = new ArrayList<>(); // 맥주 리스트 생성
    Order order = new Order(); // Order 클래스의 메서드를 사용하기 위해서 변수
    Scanner scanner = new Scanner(System.in);

    public void LoadMenu() { // 각각 리스트에 메뉴넣기
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

    public void kioskMenu() { // 키오스크 메뉴
        showIntro(); // 반복되는 인삿말
        showMenu(); // 메뉴 불러오기
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("4. Order    |   장나구니를 확인 후 주문합니다.");
        System.out.println("5. Cancel   |   진행중인 주문을 취소합니다.\n");
        System.out.print("메뉴를 선택해주세요: ");
        int menuChoice = scanner.nextInt();
        scanner.nextLine();

        switch (menuChoice) {
            case 1 -> showBurgerMenu(); // 버거 메뉴판 보기

            case 2 -> showDrinkMenu(); // 음료 메뉴판 보기

            case 3 -> showBeerMenu(); // 맥주 메뉴판 보기

            case 4 -> showOrderMenu(); // 장바구니 보기

            case 5 -> orderCancel(); // 주문 취소하기

            default -> System.out.println("1 ~ 5까지의 숫자만 입력가능합니다.");
        }
    }

    public void showIntro() { // 반복되는 인삿말을 메서드로
        System.out.println();
        System.out.println("======================================");
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
    }

    public void showMenu() { // 메뉴타이플 선택
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuList.size(); i++) { // 메뉴리스트의 size 만큼 반복해서
            Menu menu = menuList.get(i); // menu 안에 넣기
            System.out.print((i + 1) + ". "); // i는 0부터니까 +1 을 해주었습니다
            System.out.printf("%-15s  |  %s", menu.getName(), menu.getDetail()); // printf 를 사용하여, 메뉴이름과, 설명넣기
            System.out.println(); // 공백 추가
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
        int burgerChoice = scanner.nextInt(); // 버거 중에서 주문할 버거 선택
        scanner.nextLine();
        System.out.println();

        int burgerInfo = burgerChoice - 1; // 사용자가 선택한 숫자와 리스트의 숫자를 맞추기 위하여 -1
        Product selectBurger = burgerList.get(burgerInfo);
        System.out.printf("\" %-15s  | W %s | %s \"\n", selectBurger.getName(), selectBurger.getPrice(), selectBurger.getDetail());
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
        kioskMenu();

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
        System.out.printf("\" %-15s  | W %s | %s \"\n", selectDrink.getName(), selectDrink.getPrice(), selectDrink.getDetail());
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
        kioskMenu();
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
        System.out.printf("\" %-15s  | W %s | %s \"\n", selcetBeer.getName(), selcetBeer.getPrice(), selcetBeer.getDetail());
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
        kioskMenu();
    }
    public void showOrderMenu() { // 장바구니 보기
        System.out.println("아래와 같이 주문 하시겠습니까?");
        System.out.println();
        System.out.println("[ Orders ]");

        ArrayList<Product> basket = order.getBasket(); // 바스켓을 생성하고 오더클래스안에 있는 바스켓으로 가져오기

        for (int i = 0; i < basket.size(); i++) {
            Product menu = basket.get(i);
            System.out.printf("\" %-15s  | W %s | %s \"\n", menu.getName(), menu.getPrice(), menu.getDetail());
        }

        System.out.println();
        System.out.println("[ Total ]");
        System.out.println("W " + order.totalPrice()); // 오더클래스안에 있는 총금액 가져오기
        System.out.println();
        System.out.println("1. 주문      2. 메뉴판\n");
        System.out.print("메뉴 선택: ");
        int check = scanner.nextInt();
        scanner.nextLine();

        if (check == 1) {
            orderComplete();
        } else if (check == 2) {
            System.out.println("메뉴판으로 돌아갑니다.");
            kioskMenu();
        }
    }

    public void orderComplete() {
        int orderNumber = order.getOrderNumber();
        System.out.println("주문이 완료되었습니다.\n");
        System.out.println("대기번호는 [ " + orderNumber + " ] 번 입니다.");
        System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");
        try { // 3초 동안 멈추기 위해서 sleep 사용을 위해서 예외처리를 함
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        order.clearBasket(); // 주문 후 장바구니 비우기
        order.setOrderNumber(orderNumber + 1); // 주문번호 1 늘리기
        kioskMenu(); // 메인메뉴화면으로 돌아가기
    }

    public void orderCancel() {
        System.out.println();
        System.out.println("진행하던 주문을 취소하시겠습니까?\n");
        System.out.println("1. 확인      2. 취소\n");
        System.out.print("메뉴 선택:");
        int cancelNum = scanner.nextInt();
        scanner.nextLine();

        if (cancelNum == 1) {
            order.clearBasket(); // 장바구니 비우기
            System.out.println("\n진행하던 주문이 취소되었습니다.\n");
        } else if (cancelNum == 2) {
            System.out.println("\n주문을 유지하고 메뉴판으로 돌아갑니다.");
        }

        kioskMenu(); // 메인메뉴로 돌아가기
    }
}