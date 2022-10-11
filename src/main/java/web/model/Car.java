package web.model;


import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private String color;

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getSeries() == car.getSeries() && getModel().equals(car.getModel()) && getColor().equals(car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getSeries(), getColor());
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }
}
