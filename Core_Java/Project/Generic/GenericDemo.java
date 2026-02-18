package GenericEx;

// Generic Class
class Box<X, Y> {
    private X xValue;
    private Y yValue;

    public X getxValue() {
        return xValue;
    }

    public void setxValue(X xValue) {
        this.xValue = xValue;
    }

    public Y getyValue() {
        return yValue;
    }

    public void setyValue(Y yValue) {
        this.yValue = yValue;
    }
}



public class GenericDemo {
    public static void main(String[] args) {

        Box<String, Integer> stringBox = new Box<>();
        stringBox.setxValue("Hello Generics");
        stringBox.setyValue(100); // stringBox.set

        System.out.println(stringBox.getxValue());
        System.out.println(stringBox.getyValue());

        Box<Integer, Boolean> intBox = new Box<>();
        intBox.setxValue(100);
        intBox.setyValue(true);

        System.out.println(intBox.getxValue());
        System.out.println(intBox.getyValue());
    }
}
