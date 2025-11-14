package basics;
enum PRODUCTS {
    PIZZA, BURGER, DRINKS, DESSERTS
}
//switch - menu driven bnane k liye
//it is faster than if-else

public class switchcase {
    public static void main(String[] args) {
        // final int BURGER = 1;
        // final int PIZZA = 2;
        // final int DRINKS = 3;
        // final int DESSERTS = 4;
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Drinks");
        System.out.println("4. Desserts");
        String choice = "Burger";
        int a = 10 + 20;
        double price = switch (choice) {
            case "Burger" -> {
                var a1 = 10;
                var b = 20;
                var c = a1 + b * 30;
                yield c;

            }
            case "Pizza" -> 200;
            case "Drinks", "Coffee" -> 300;
            default -> 0;
        };

        // switch (choice) {
        // case "Burger":
        // System.out.println("Rs 100");
        // case "Pizza":
        // System.out.println("Rs 200");
        // case "Drinks":
        // System.out.println("Rs 50");
        // case "Desserts":
        // System.out.println("Rs 150");
        // default:
        // System.out.println("Invalid Choice...");

        // }
    }
}
//package day1;
//enum PRODUCTS {
//    PIZZA, BURGER, DRINKS, DESSERTS
//}
////switch - menu driven bnane k liye
////it is faster than if-else
//
//public class switchcase {
//    public static void main(String[] args) {
//            // final int BURGER = 1;
//            // final int PIZZA = 2;
//            // final int DRINKS = 3;
//            // final int DESSERTS = 4;
//            System.out.println("1. Burger");
//            System.out.println("2. Pizza");
//            System.out.println("3. Drinks");
//            System.out.println("4. Desserts");
//            String choice = "Burger";
//            int a = 10 + 20;
//            double price = switch (choice) {
//                case "Burger" -> {
//                    var a1 = 10;
//                    var b = 20;
//                    var c = a1 + b * 30;
//                    yield c;
//
//                }
//                case "Pizza" -> 200;
//                case "Drinks", "Coffee" -> 300;
//                default -> 0;
//            };
//
//            // switch (choice) {
//            // case "Burger":
//            // System.out.println("Rs 100");
//            // case "Pizza":
//            // System.out.println("Rs 200");
//            // case "Drinks":
//            // System.out.println("Rs 50");
//            // case "Desserts":
//            // System.out.println("Rs 150");
//            // default:
//            // System.out.println("Invalid Choice...");
//
//            // }
//        }
//}
//
