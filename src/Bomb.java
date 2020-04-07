public class Bomb {
    int x;
    int y;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
