public class Hello{
    public String sayHello(String [] name, String city, String state){
        String output = "Hello,";
        for (String i : name) {
            output += " " + i;
        }
        output += "! Welcome to " + city + ", " + state + "!";
        return output;
    }
}