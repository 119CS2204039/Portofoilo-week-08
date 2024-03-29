import java.util.Scanner;
interface OrderDelivery
{
	public void deliverOrder();
}
class Swiggy implements OrderDelivery
{
	String cust_name;
	byte orderID;
	Swiggy(){
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the customer Name...");
		cust_name=inScanner.next();
		System.out.println("Enetr the Customer Nmae...");
		orderID=inScanner.nextByte();
	}
	public void deliverOrder() {
		System.out.println("Delivering food order of Mr."+cust_name+"with order number"+orderID+".");
	}
}
class SwiggyInstamart implements OrderDelivery
{
	String cust_name;
	byte orderID;
	int product_qty;
	SwiggyInstamart(){
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the Customer Name...");
		cust_name=inScanner.next();
		System.out.println("Enter the order ID...");
		orderID=inScanner.nextByte();
		System.out.println("Enter the product quantity...");
		product_qty=inScanner.nextInt();
	}
	public void deliverOrder() {
		System.out.print("Delivering Grocery order of Mr."+cust_name+"with order number"+orderID+".\nThe total no products delivered are"+product_qty);	
	}
}
class Delivery
{
	public void deliverToCustomer(OrderDelivery od) {
	od.deliverOrder();
	}
}
public class demoOCP{
	public static void main(String args[])
	{
		Delivery order=new Delivery();
		Swiggy sw=new Swiggy();
		order.deliverToCustomer(sw);
		SwiggyInstamart insta=new SwiggyInstamart();
		order.deliverToCustomer(insta);
	}
}