import java.util.Scanner;
interface order {
    void showOrder();
}
enum food {
    sandwich, burger, fries, pasta
}
public class restaurantOrdering implements order {
    static int order1 = 0;
    static int order2= 0;
    static int order3= 0;
    static int order4= 0;

    public void showOrder() {
        System.out.println("Sandwiches: " + order1);
        System.out.println("Burger:" + order2);
        System.out.println("Fries" + order3);
        System.out.println("Pasta" + order4);
    }
    static void addOrder(food item) {
        if (item == food.sandwich) {
            order1++;
        }else if (item == food.burger) {
            order2++;
        }else if (item == food.fries) {
            order3++;
        }else if(item == food.pasta) {
            order4++;
        }

    }
    static void addOrder(food item, int quantity) {
        if(item == food.sandwich) {
            order1 += quantity;
        }else if(item == food.burger) {
            order2 += quantity;
        }else if(item == food.fries) {
            order3 += quantity;
        }else if(item == food.pasta) {
            order4 += quantity;
        }
    }
    public static void main(String[] args) {

        restaurantOrdering restaurant = new restaurantOrdering();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our Restaurant");

        System.out.println("1. sandwich");
        System.out.println("2. burger");
        System.out.println("3. fries");
        System.out.println("4. pasta");
        System.out.println("5. finish order");

        while(true) {

            System.out.println("Enter your choice (1-5):");
            int choice = input.nextInt();

            if (choice == 1) {
                addOrder(food.sandwich);
            }else if(choice == 2) {
                addOrder(food.burger);
            }else if (choice == 3) {
                addOrder(food.fries);
            }else if (choice == 4) {
                addOrder(food.pasta);
            }else if (choice == 5) {
                System.out.println("Order finished!");
                break;
            }else {
                System.out.println("Invaild choice. Try again.");
            }

        }

        int total = order1 + order2 + order3 + order4;

        restaurant.showOrder();

        System.out.println("Total items ordered" + total);

        input.close();

    }


}
