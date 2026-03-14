// Encapsulation example
class Encapsulation {
    private String name; // private variable

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }
}


// Non-public Main class
class Main{
    public static void main(String[] args) {
        Encapsulation s = new Encapsulation();
        s.setName("Rahul");
        System.out.println(s.getName());
    }
}
