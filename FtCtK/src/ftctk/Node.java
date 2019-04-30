package ftctk;

public class Node {
    Node prev = null;
    Node next = null;
    double temp;
    double Ctemp;
    double Ktemp;
    
    public Node(double temp) {
        this.temp = temp;
        this.Ctemp = (temp-32)*5/9;
        this.Ktemp = ((temp-32)*5/9)+273.15;
    }
    public double getTemp()  {return this.temp;}
    public double getCTemp() {return this.Ctemp;}
    public double getKTemp() {return this.Ktemp;}
}
