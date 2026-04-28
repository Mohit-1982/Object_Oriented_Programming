package OOPS.Day7;

enum Dir {

    //we are using concept of anonymous classes

    NORTH {
        @Override
        public void move() {
            System.out.println("Move Up : (x, y - 1)");
        }
    },
    EAST {
        @Override
        public void move() {
            System.out.println("Move Right : (x + 1, y)");
        }
    },
    WEST {
        @Override
        public void move() {
            System.out.println("Move Left : (x - 1, y)");
        }
    },
    SOUTH {
        @Override
        public void move() {
            System.out.println("Move Down : (x, y + 1)");
        }
    };

    public abstract void move();
}

public class AbstractEnum {
    public static void main(String[] args) {
        Dir d = Dir.EAST;
        d.move();
    }
}
