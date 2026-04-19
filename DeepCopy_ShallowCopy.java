package OOPS;

class Shallow {
    int val;
    String shallow;

    Shallow(int val, String shallow) {
        this.val = val;
        this.shallow = shallow;
    }
}
class Deep {
    int val;
    String deep;

    Deep(int val) {
        this(val, null);
    }

    Deep(int val, String deep) {
        this.val = val;
        this.deep = deep;
    }
}
public class DeepCopy {
    public static void main(String[] args) {
        Deep r1 = new Deep(14, "Rohan");
        Deep r2 = new Deep(15, "Shubham");//it creates a new block in memory won't change our original object
        r2.deep = "Mohit";
        //System.out.println(r1.deep);

        Shallow s1 = new Shallow(56, "Tihot");
        Shallow s2 = s1;//This will change as they both are pointing to same object
        s2.shallow = "ROhit Negi";
        System.out.println(s1.shallow);
    }
}
