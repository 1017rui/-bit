package rui;

public class Duck2 {
    private String n;
    private int a;

    public Duck2(String n, int a) {
        this.n = n;
        this.a = a;
    }

    public String getName() {
        return n;
    }

    public void setName(String n) {
        this.n = n;
    }

    public int getAge() {
        return a;
    }

    public void setAge(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + n + '\'' +
                ", age=" + a +
                '}';
    }
}
