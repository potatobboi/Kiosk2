package try2;

public class Menu {
    private String name; // 상품 이름
    private String detail; // 상품 설명

    public Menu(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }
}
