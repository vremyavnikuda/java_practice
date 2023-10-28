package offer_task;

public enum Planet {
    MARS(3389, 6419),
    EARTH(6371, 59742);

    private int radius;
    private int mass = 700;

    Planet(int radius, int mass) {
        this.radius = radius;
        this.mass = mass;
    }

    public int getRadius() {
        return radius;
    }

    public int getMass() {
        return mass;
    }
}

