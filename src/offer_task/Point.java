package offer_task;

import java.util.Objects;

public class Point {

    private final int x;
    private final int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public boolean equals(Point other){
        if (this==other) {
            return true;
        }

        return this.x==other.x&&this.y==other.y;
    }

    public int hashCode(){
        return Objects.hash(x,y);
    }
}
