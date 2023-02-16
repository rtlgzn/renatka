public class Temperature {
    private double value;
    private char scale;

    public Temperature() {
        this(0, 'C');
    }

    public Temperature(double value) {
        this(value, 'C');
    }

    public Temperature(char scale) {
        this(0, scale);
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public char getScale() {
        return scale;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public double getCelsius() {
        if (scale == 'F') {
            return 5 * (value - 32) / 9;
        }
        else {
            return value;
        }
    }

    public double getFahrenheit() {
        if (scale == 'C') {
            return (9 * value / 5) + 32;
        }
        else {
            return value;
        }
    }

    public void setTemperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
}
