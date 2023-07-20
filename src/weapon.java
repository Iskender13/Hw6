public class weapon {
    public enum weaponType{
        firearm,
        laser,
        nuclear,}
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    private String type;
    private String name;


    public weapon(String type, String name) {
        this.type = type;
        this.name = name;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
