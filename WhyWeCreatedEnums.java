package OOPS.Day7;

class PaymentStatus {
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
}

class Role {
    public static final int USER = 1;
    public static final int ADMIN = 2;//manager and admin both have same values so this can cause error in code
    public static final int MANAGER = 2;
}

public class WhyWeCreatedEnums {
   public static void main(String[] args) {
       int status = PaymentStatus.FAILED;
       int status2 = 100;//it doesn't have type safety

       if (status == Role.USER) {
           //we are comparing status with a role means,
           //no grouping of same entities
           System.out.println();
       }
   }
}
