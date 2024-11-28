public class Data {
    private String name;
    private String pass;
    private String mob;

    public Data(String name, String pass, String mob) {
        this.name = name;
        this.pass = pass;
        this.mob = mob;
    }
    public String getName(){
        return name;
    }
    public String getPass() {
        return pass;
    }
    public String getMob() {
        return mob;
    }
}
