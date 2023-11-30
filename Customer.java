public class Customer {

    private int id;
    private String name;
    private City city;
    private Color color;

    public Customer(int id, String name, City city, Color color) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.color = color;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public City getcity() {
        return city;
    }

    public Color getcolor() {
        return color;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setcity(City city) {
        this.city = city;
    }

    public void setcolor(Color color) {
        this.color = color;
    }

}
