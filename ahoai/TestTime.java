package ahoai;

class TestTime {
    public static void main(String[] args) {
        Time t = new Time(4, 11, 2);
        t.display();
        t.setTime(24, 60, 59);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(22, 5, 2);
        t.display();
        t.previousSecond();
        t.display();
    }
}
