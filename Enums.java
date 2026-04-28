package OOPS.Day7;

enum PayStatus {
    SUCCES,
    FAILED,
    PENDING;
}

public class Enums {
    public static void main(String[] args) {
        PayStatus status = PayStatus.FAILED;
//        PayStatus status1 = 100;//this will give type type mismatch error as status1 holds paystatus not int
//        if (status == "FAILED") {his will give type type mismatch error as status1 holds paystatus not String
//            System.out.println();
//        }
        System.out.println(status.name());
    }
}
