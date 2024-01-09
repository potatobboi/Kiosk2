package try1;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String menuTitle = "\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"\n" +
                "아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n";

        ArrayList<String> Menu = new ArrayList<>();
        Menu.add("Burgers         | 앵거스 비프 통살을 다져만든 버거");
        Menu.add("Drinks          | 매장에서 직접 만드는 음료");
        Menu.add("Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");

        ArrayList<String> burgerMenu = new ArrayList<>();
        burgerMenu.add("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgerMenu.add("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgerMenu.add("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거");

        ArrayList<String> drinkMenu = new ArrayList<>();
        drinkMenu.add("CoKe          | W 3.5 | 드럽게 비싼 콜라");
        drinkMenu.add("LemonAde      | W 4.5 | 드럽게 비싼 레몬에이드");
        drinkMenu.add("Shake         | W 6.5 | 감튀에 찍어먹는 밀크쉐이크");

        ArrayList<String> beerMenu = new ArrayList<>();
        beerMenu.add("Beer          | W 5.0 | 햄버거에 맥주?");
        beerMenu.add("Cass          | W 4.5 | 햄버거에 맥주?");
        beerMenu.add("Tera          | W 4.5 | 햄버거에 맥주?");

        ArrayList<String> basket = new ArrayList<>();

        int WaitNum = 1;


        while (true) {
            System.out.println(menuTitle);

            System.out.println("[ SHACKSHACK MENU ]");
            for (int i = 0; i < Menu.size(); i++) {
                System.out.println((i + 1) + ". " + Menu.get(i));
            }

            System.out.println();
            System.out.println("[ ORDER MENU ]");
            System.out.println("4. Order       | 장바구니를 확인 후 주문합니다.");
            System.out.println("5. Cancel      | 진행중인 주문을 취소합니다.");
            System.out.println("6. Exit        | 프로그램을 종료합니다.\n");

            System.out.print("메뉴를 선택하세요: ");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            if (menuChoice == 1) { // 햄버거 선택
                System.out.println(menuTitle);
                System.out.println("[ Burgers MENU ]");
                for (int i = 0; i < burgerMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + burgerMenu.get(i));
                }
                System.out.print("메뉴를 선택해주세요: ");
                int burgerChoice = scanner.nextInt();
                System.out.println();

                if (burgerChoice == 1) { // 햄버거 종류 선택
                    System.out.println("\"" + burgerMenu.get(0) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("ShackBurger 가 장바구니에 추가되었습니다.");
                        basket.add(burgerMenu.get(0));
                        System.out.println();
                    }


                } else if (burgerChoice == 2) {
                    System.out.println("\"" + burgerMenu.get(1) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("Cheeseburger 가 장바구니에 추가되었습니다.");
                        basket.add(burgerMenu.get(1));
                        System.out.println();
                    }


                } else if (burgerChoice == 3) {
                    System.out.println("\"" + burgerMenu.get(2) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("Hamburger 가 장바구니에 추가되었습니다.");
                        basket.add(burgerMenu.get(2));
                        System.out.println();
                    }
                }
            }
            if (menuChoice == 2) { // 음료수 선택
                System.out.println(menuTitle);
                System.out.println("[ Drinks MENU ]");
                for (int i = 0; i < drinkMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + drinkMenu.get(i));
                }
                System.out.print("메뉴를 선택해주세요: ");
                int drinkChoice = scanner.nextInt();
                System.out.println();

                if (drinkChoice == 1) { // 음료수 종류 선택
                    System.out.println("\"" + drinkMenu.get(0) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("CoKe 가 장바구니에 추가되었습니다.");
                        basket.add(drinkMenu.get(0));
                        System.out.println();
                    }


                } else if (drinkChoice == 2) {
                    System.out.println("\"" + drinkMenu.get(1) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("LemonAde 가 장바구니에 추가되었습니다.");
                        basket.add(drinkMenu.get(1));
                        System.out.println();
                    }


                } else if (drinkChoice == 3) {
                    System.out.println("\"" + drinkMenu.get(2) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("Shake 가 장바구니에 추가되었습니다.");
                        basket.add(drinkMenu.get(2));
                        System.out.println();
                    }
                }
            }

            if (menuChoice == 3) { // 주류 선택
                System.out.println(menuTitle);
                System.out.println("[ Beers MENU ]");
                for (int i = 0; i < beerMenu.size(); i++) {
                    System.out.println((i + 1) + ". " + beerMenu.get(i));
                }
                System.out.print("메뉴를 선택해주세요: ");
                int beerChoice = scanner.nextInt();
                System.out.println();

                if (beerChoice == 1) { // 주류 종류 선택
                    System.out.println("\"" + beerMenu.get(0) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("SoJu 가 장바구니에 추가되었습니다.");
                        basket.add(beerMenu.get(0));
                        System.out.println();
                    }

                } else if (beerChoice == 2) {
                    System.out.println("\"" + beerMenu.get(1) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("Cass 가 장바구니에 추가되었습니다.");
                        basket.add(beerMenu.get(1));
                        System.out.println();
                    }

                } else if (beerChoice == 3) {
                    System.out.println("\"" + beerMenu.get(2) + "\"");
                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인        2. 취소");

                    System.out.print("메뉴를 선택해주세요: ");
                    int martChoice = scanner.nextInt();
                    System.out.println();

                    if (martChoice == 1) {
                        System.out.println("Tera 가 장바구니에 추가되었습니다.");
                        basket.add(beerMenu.get(2));
                        System.out.println();
                    }
                }
            }

            if (menuChoice == 4) {
                System.out.println("아래와 같이 주문 하시겠습니까?\n");
                System.out.println("[ Orders ]");
                for (String a : basket) {
                    System.out.println(a);
                }
                System.out.println();

                System.out.println("[ Total ]");
                double total = 0;
                for (int i = 0; i < basket.size(); i++) {
                    String cash = basket.get(i).substring(18, 21);
                    Double money = Double.parseDouble(cash);
                    total += money;
                }
                System.out.println("W " + total);
                System.out.println();
                System.out.println("1. 주문     2. 메뉴판");

                System.out.print("메뉴를 선택하세요: ");
                int orderChoice = scanner.nextInt();
                scanner.nextLine();

                if (orderChoice == 1) {
                    System.out.println("주문이 완료되었습니다!\n");
                    System.out.println("대기번호는 [ " + WaitNum + " ] 번 입니다");
                    System.out.println("(3초후 메뉴판으로 돌아갑니다.)\n");
                    WaitNum++;
                    basket.clear();
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            if (menuChoice == 5) {
                System.out.println("진행하던 주문을 취소하기셌습니까?");
                System.out.println("1. 확인      2. 취소");

                System.out.print("메뉴를 선택해주세요: ");
                int cancelChoice = scanner.nextInt();
                if (cancelChoice == 1) {
                    basket.clear();
                    System.out.println("진행하던 주문이 취소되었습니다.");
                }
            }
            if (menuChoice == 6) {
                System.out.println("프로그램을 종료하시겠습니까?");
                System.out.println("1. 확인      2. 취소\n");

                System.out.print("메뉴를 선택해주세요: ");
                int exitChoice = scanner.nextInt();
                if (exitChoice == 1) {
                    break;
                }
            }
        }
    }
}