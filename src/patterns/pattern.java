package patterns;
//*****
//****
//***
//**
//*
public class pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {          // rows
            for (int j = 0; j < n - i; j++) {  // column
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

