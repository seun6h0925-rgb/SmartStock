package com.smartstock.view;

import com.smartstock.model.Category;
import java.util.Scanner;

public class ProductView {

    public void printMainMenu() {
    System.out.println("===== SmartStock =====");
    System.out.println("1. 상품 등록");
    System.out.println("2. 전체 상품 조회");
    System.out.println("3. 상품 번호 조회");
    System.out.println("4. 상품 수정");
    System.out.println("5. 상품 삭제");
    System.out.println("6. 카테고리별 상품 조회");
    System.out.println("7. 재고 부족 상품 조회");
    System.out.println("9. 프로그램 종료");
}
    private final Scanner scanner = new Scanner(System.in);

    public int inputMenu() {

        while (true) {
            int menu = readInt("메뉴를 선택하세요: ");

            if ((menu >= 1 && menu <= 7) || menu == 9) {
                return menu;
            }

            System.out.println("[오류] 메뉴에 있는 번호를 선택해주세요.");
        }
    }

    public int readInt(String message) {

        while (true) {
            System.out.print(message);

            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[오류] 숫자를 입력해주세요.");
            }
        }
    }
    public int inputProductId() {

        while (true) {
            int productId = readInt("상품 번호를 입력하세요: ");

            if (productId > 0) {
                return productId;
            }

            System.out.println("[오류] 상품 번호는 1 이상이어야 합니다.");
        }
    }
    public int inputPrice() {

        while (true) {
            int price = readInt("가격을 입력하세요: ");

            if (price >= 0) {
                return price;
            }

            System.out.println("[오류] 가격은 0원 이상이어야 합니다.");
        }
    }
    public int inputStockQuantity() {

        while (true) {
            int stockQuantity = readInt("재고 수량을 입력하세요: ");

            if (stockQuantity >= 0) {
                return stockQuantity;
            }

            System.out.println("[오류] 재고 수량은 0개 이상이어야 합니다.");
        }
    }
    public String inputProductName() {

        while (true) {
            System.out.print("상품명을 입력하세요: ");
            String productName = scanner.nextLine();

            if (!productName.isBlank()) {
                return productName;
            }

            System.out.println("[오류] 상품명을 입력해주세요.");
        }
    }

        public Category inputCategory() {

            while (true) {
                System.out.println("카테고리를 선택하세요.");
                System.out.println("1. FOOD");
                System.out.println("2. LIVING");
                System.out.println("3. ELECTRONICS");
                System.out.println("4. FISHING");
                System.out.println("5. FASHION");
                System.out.println("6. BEAUTY");
                System.out.println("7. ETC");

                int choice = readInt("선택: ");

                switch (choice) {
                    case 1:
                        return Category.FOOD;
                    case 2:
                        return Category.LIVING;
                    case 3:
                        return Category.ELECTRONICS;
                    case 4:
                        return Category.FISHING;
                    case 5:
                        return Category.FASHION;
                    case 6:
                        return Category.BEAUTY;
                    case 7:
                        return Category.ETC;
                    default:
                        System.out.println("[오류] 1 ~ 7 사이의 번호를 입력해주세요.");
                }
            }
        }
    public void printMessage(String message) {
        System.out.println(message);
    }

    public int inputStockLimit() {

        while (true) {
            int quantity = readInt("재고 기준 수량을 입력하세요: ");

            if (quantity >= 0) {
                return quantity;
            }

            System.out.println("[오류] 재고 기준 수량은 0 이상이어야 합니다.");
        }
    }

}
