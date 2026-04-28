package OOPS.Day7;

enum Direct {
    NORTH,
    EAST,
    WEST,
    SOUTH;
}

public class EnumFunctionality {
    public static void main(String[] args) {
        Direct[] d = Direct.values();//return array of enum

        for (Direct ele : d) {
            System.out.print(ele + " ");
        }
        System.out.println();

        Direct e = Direct.valueOf("EAST");
        System.out.println(e);//IllegalArgumentException if we have pass East instead of EAST as we have declared
        //EAST in enum not East

        System.out.println(e.name());

        System.out.println(e.ordinal());//returns index of enum const
    }
}
