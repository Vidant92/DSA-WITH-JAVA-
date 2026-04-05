package recursion;

 class Reverse {
    public static void main(String[] args) {
        int n = 1234;
        int r = 0;
        System.out.println("Reverse is " + rev(n, r));
    }

    public static int rev(int n, int r) {
        // base case
        if (n == 0) {
            return r;
        }

        int rem = n % 10;
        r = r * 10 + rem;

        // recursive call
        return rev(n / 10, r);
    }
}
