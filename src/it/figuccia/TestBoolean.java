package it.figuccia;

public class TestBoolean {
    public static void main(String[] args) {
        int a = 1, b = 3, c = a * b, d = c;
        boolean r1 = (d / c + 2) >= b || !(c + b - c / a == 3);
        int x = 5, y = 6;
        boolean t = false,  f = true;
        boolean r2 = (x * x - y * y / 2 != 12) || !t && f;

        System.out.println("[A]= "+r1);
        System.out.println("[B]= "+r2);
    }

}
