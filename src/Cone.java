public class Cone{
    public double radius;
    public double height;

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double calculateLateralSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * slantHeight;
    }

    public double calculateVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Cone cone = new Cone(5, 10);

        double lateralSurfaceArea = cone.calculateLateralSurfaceArea();
        double volume = cone.calculateVolume();

        System.out.println("Площа бічної поверхні: " + lateralSurfaceArea);
        System.out.println("Об'єм: " + volume);
    }
}