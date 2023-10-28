package offer_task;

public class test_2 {
    record Point(int x, int y) {

        public class point {

            private int x=1;
            private int y=2;

            public point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            // getters, setters
            // equals, hashcode, toString
        }
    }
    public static void main (String[]args){
        for (int i=0;i< args.length;i++){
            System.out.print(args[i]+" ");
        }
    }
}
