package chars;

public class Vector2 {
    int x, y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Vector2 opposit) {
        return opposit.y == y && opposit.x == x;
    }

      public float getDistance(float x, float y) {
        float dx = x - this.x;
        float dy = y - this.y;
        return (float) Math.sqrt(dx * dx + dy * dy);
    }
}