package OOPS;

public class thiskeyword {

    public static class Car {
        int price;
        String name;

        Car() { // default constructor
        }

        Car(int price, String name) {
            this.price = price;
            this.name = name;
        }

        Car(String s, int x) {
            this.price = x;
            this.name = s;
        }

        void print() {
            // yahan hum instance variable change kar rahe hain
            //this.price = 12;
           // int price =12;
            System.out.println(price + " " + name);
        }
    }
    public static void main(String[] args) {
        Car c1 = new Car(1250000, "Kia Sonet");
        c1.print(); // price change ho jaayega 12 me
        Car c2 = new Car("Lord Alto", 400000);
        c2.print(); // price change ho jaayega 12 me
        Car c3 = new Car();
        c3.name = "Honda Amaze";
        c3.price = 900000;
        c3.print(); // yahan bhi price 12 ho jaayega
    }
}

