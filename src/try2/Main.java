package try2;


public class Main {
    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();
        kiosk.LoadMenu(); // 리스트 가져오기
        kiosk.kioskMenu(); // 키오스크 시작
    }
}