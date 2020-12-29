import java.util.Objects;

public class ContinentInfo {
    private int count = 0;

    public void increase() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
