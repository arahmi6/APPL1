/**
 *
 * @author AULIA RAHMI
 */
abstract class Shape {
    String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    abstract double area();
    
    @Override
    public String toString() {
        return "Shape Name = " + shapeName;
    } 
}
