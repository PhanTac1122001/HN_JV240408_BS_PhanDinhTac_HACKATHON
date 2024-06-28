package ra.run;

import java.util.Scanner;

public class MenuManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("================== MENU ==================\n" +
                    "1.\tQuản lý danh mục\n" +
                    "2.\tQuản lý sản phẩm\n" +
                    "3.\tThoát\n");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    CatalogManagement.menuCatalog(scanner);
                    break;
                case 2:
                    ProductManagement.menuProduct(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn lại từ 1 -> 3");
            }
        } while (true);
    }
}
