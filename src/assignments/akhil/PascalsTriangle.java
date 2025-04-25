package assignments.akhil;

public class PascalsTriangle {
    public static void main(String[] args) {
        for (int j = 1; j <7; j++) {
            System.out.println();
            for (int i = 1; i <12; i++) {
                if (j == 1) {
                    if (i == 6) {
                        System.out.print("1");
                    } else {
                        System.out.print(" ");
                    }

                }
                if (j == 2) {
                    if ( i == 5 | i == 7) {
                        System.out.print("1");
                    } else {
                        System.out.print(" ");
                    }


                }
                if (j == 3) {
                    if ( i == 4 | i == 8) {
                        System.out.print("1");
                    } else if (i == 6) {
                        System.out.print("2");
                    }
                    else
                        System.out.print(" ");

                }
                if (j == 4) {
                    if (i == 3 | i == 9) {
                        System.out.print("1");
                    } else if (i == 5 | i == 7) {
                        System.out.print("3");
                    }
                    else
                        System.out.print(" ");

                }
                if (j == 5) {
                    if (i == 2 | i == 10) {
                        System.out.print("1");
                    } else if (i == 4 | i == 8) {
                        System.out.print("4");
                    } else if (i == 6) {
                        System.out.print("6");
                    }
                    else
                        System.out.print(" ");


                }
                if (j == 6) {
                 if (i == 1 | i == 11) {
                        System.out.print("1");
                    } else if (i == 3 | i == 9) {
                        System.out.print("5");
                    } else if (i == 5 | i == 7) {
                        System.out.print("10");
                    } else
                        System.out.print(" ");


                }
            }


        }
    }
}
