package OOPs;
class Cart{
    private String itemName;
    private int quantity;
    private double price;

    public Cart(){
         this.itemName = "empty";
         this.quantity = 0;
         this.price = 0;

    }
    public void Setter(String itemName,int quantity,double price){
        this.itemName = itemName;
         this.quantity = quantity;
         this.price = price;
    }
    // public void totalAmt(){
    //     System.out.println("Toatl :"+quantity*price);
    // }
    public double totalAmt(){
        return quantity*price;
    }

}
public class Setter {
    public static void main(String[] args) {
        Cart ob1 = new Cart();
        ob1.Setter("cap",1,150);
        // ob1.totalAmt();
        System.out.println("Total is "+ob1.totalAmt());
    }
}
