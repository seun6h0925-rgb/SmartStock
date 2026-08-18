package com.smartstock;

import com.smartstock.model.Category;
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
                    int productId = view.inputProductId();
                    String productName = view.inputProductName();
                    Category category = view.inputCategory();
                    int price = view.inputPrice();
                    int stockQuantity = view.inputStockQuantity();

                    controller.registerProduct(
                            productId,
                            productName,
                            category,
                            price,
                            stockQuantity
                    );
                    break;

                case 2:
                    controller.showAllProducts();
                    break;
                case 3:
                    int searchId = view.inputProductId();
                    controller.showProductById(searchId);
                    break;
                case 4:
                    int updateId = view.inputProductId();
                    String updateName = view.inputProductName();
                    Category updateCategory = view.inputCategory();
                    int updatePrice = view.inputPrice();
                    int updateStock = view.inputStockQuantity();

                    controller.updateProduct(
                            updateId,
                            updateName,
                            updateCategory,
                            updatePrice,
                            updateStock
                    );

                    break;

                case 5:
                    int deleteId = view.inputProductId();
                    controller.deleteProduct(deleteId);
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
