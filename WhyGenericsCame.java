package OOPS.Day11;

class BoX {
    private Object value;

    BoX(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }
}

public class WhyGenericsCame {
    public static void main(String[] args) {
        BoX b = new BoX(10);
        BoX b1 = new BoX("Mohit");
        BoX b2 = new BoX(true);

//        b.getValue() + 5; this will give error becasue Object don't know whose Object b is.
        //so do DownCasting
        Integer x = (Integer) b.getValue();
        String y = (String) b1.getValue();
        Boolean z = (Boolean) b2.getValue();

        x += 5;//now allowed
    }
}
