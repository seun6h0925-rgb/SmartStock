package com.smartstock;

import com.smartstock.controller.ProductController;
import com.smartstock.repository.ProductRepository;
import com.smartstock.view.ProductView;

public class Application {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();
        ProductController controller = new ProductController(repository);
        ProductView view = new ProductView();

        while (true) {

            view.printMainMenu();
            int menu = view.inputMenu();

            switch (menu) {
                case 1:
                    System.out.println("상품 등록 기능");
                    break;
                case 2:
                    System.out.println("전체 상품 조회 기능");
                    break;
                case 3:
                    System.out.println("상품 번호 조회 기능");
                    break;
                case 4:
                    System.out.println("상품 수정 기능");
                    break;
                case 5:
                    System.out.println("상품 삭제 기능");
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴에 있는 번호를 선택해주세요.");
            }

        }

    }

}
