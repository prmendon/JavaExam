import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * 
 */

/**
 * @author Prajna Mendon
 *
 *         Modified Date : Jul 10, 2019
 */
public class Application {
	private static HashSet<Orders> orderslist;
	private static List<Orders> list;

	public static void main(String[] args) {

		Customer c1 = new Customer(1, "Prajna", "Mendon");
		Customer c2 = new Customer(2, "Vansh", "Patel");
		Customer c3 = new Customer(5, "Sujit", "Jadhav");
		Customer c4 = new Customer(3, "Akash", "Kodre");
		Customer c5 = new Customer(4, "Masood", "H");

		Address b1 = new Address("7816 , Hanover Pkwy", "Apt 202", "Greenbelt", "Maryland", 20770);
		Address b2 = new Address("7830 , Hanover Pkwy", "Apt 102", "Greenbelt", "Maryland", 20770);
		Address b3 = new Address("4402  Wilson Street", "Apt 1030", "Vista", "California", 92083);
		Address b4 = new Address("3807 Lindale Avenue", "Apt 526", "Fremont", "California", 94539);
		Address b5 = new Address("1300  Farnum Road", "Apt 1202", "New York", "New York", 10022);

		Address s1 = new Address("3102  Yorkie Lane", "Apt 202", "Statesboro", "Georgia", 30458);
		Address s2 = new Address("101 S First Bangs", "Texas Mail 490 St", "Bangs", "TX", 76823);
		Address s3 = new Address("30201 290th Ave", "Apt 1030", "Badger", "MN", 56714);
		Address s4 = new Address("933 46th St #3", "Apt 526", "Emeryville", "California", 94608);
		Address s5 = new Address("4064 Sandpiper Ln", "Apt 1202", "Columbus", "IN", 47203);

		/*
		 * Date d1 = new Date(01, 01, 2019); Date d2 = new Date(02, 21, 2018); Date d3 =
		 * new Date(05, 22, 2019); Date d4 = new Date(05, 28, 2019); Date d5 = new
		 * Date(04, 10, 2016);
		 */

		PaymentInfo p1 = new PaymentInfo("MasterCard", 654788521, 258, "Jay", "rupa");
		PaymentInfo p2 = new PaymentInfo("Discover", 60110009, 369, "John", "M");
		PaymentInfo p3 = new PaymentInfo("JCB", 353011133, 258, "Prajna", "Mendon");
		PaymentInfo p4 = new PaymentInfo("MasterCard", 555554444, 278, "ABC", "DEF");
		PaymentInfo p5 = new PaymentInfo("MasterCard", 55554444, 159, "Doe", "Mike");

		Orders o1 = new Orders(1001, c1, 12, LocalDate.of(01, 04, 2019), 120.0, b1, s1, p1);
		Orders o2 = new Orders(1005, c2, 1, LocalDate.of(02, 21, 2019), 10.02, b2, s2, p2);
		Orders o3 = new Orders(1004, c3, 25, LocalDate.of(05, 22, 2019), 190.05, b3, s3, p3);
		Orders o4 = new Orders(1011, c4, 30, LocalDate.of(05, 28, 2019), 210.00, b4, s4, p4);
		Orders o5 = new Orders(1000, c5, 2, LocalDate.of(04, 10, 2019), 40.02, b5, s5, p5);

		orderslist = new HashSet<Orders>();
		orderslist.add(o1);
		orderslist.add(o2);
		orderslist.add(o3);
		orderslist.add(o4);
		orderslist.add(o5);

		list = new ArrayList<Orders>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		list.add(o4);
		list.add(o5);

		System.out.println("----Printing the unordered list----");
		orderslist.forEach(System.out::println);
		System.out.println("----------------------------------------------------");

		System.out.println("----Sorting according to the OrderId----");
		Collections.sort(list, new SortById());
		list.forEach(System.out::println);
		System.out.println("----------------------------------------------------");

		System.out.println("----Sorting according to the Name----");
		Collections.sort(list, new SortByName());
		list.forEach(System.out::println);
		System.out.println("----------------------------------------------------");

		Collections.sort(list, new SortByBillingZipCode());
		System.out.println("----Sorting according to the BillingZipCode----");
		list.forEach(System.out::println);
		System.out.println("----------------------------------------------------");

		Collections.sort(list, new SortByShippingZipCode());
		System.out.println("----Sorting according to the ShippingZipCode----");
		list.forEach(System.out::println);
		System.out.println("----------------------------------------------------");
		
		System.out.println("Search Order by Customer First Name");
		SearchByFirstName.searchByFirstName(list);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Search Order by Customer Last Name");
		SearchByLastName.searchByLastName(list);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Search Order by Order Id");
		SearchByOrderId.searchByOrderId(list);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Search by Billing Zip Code");
		SearchByBillingZipCode.searchByBillingZipCode(list);
		
		System.out.println("----------------------------------------------------");
		System.out.println("Search by Shipping Zip Code");
		SearchByShippingZipCode.searchByShippingZipCode(list);
		
/*		System.out.println("Search Order by Customer First Name");
		Orders order = orderslist.stream().filter(x -> "ABDC".equals(x.getCustomer().getFirstName())).findAny()
				.orElse(null);

		System.out.println("----------------------------------------------------");
		System.out.println("Search Order by Customer Last Name");
		Orders order1 = orderslist.stream().filter(x -> "ABDC".equals(x.getCustomer().getLastName())).findAny()
				.orElse(null);
		System.out.println(order1);

		System.out.println("----------------------------------------------------");
		System.out.println("Search Order by Order Id");
		Orders order2 = orderslist.stream().filter(x -> x.getOrderId() == 1001).findAny().orElse(null);
		System.out.println(order2);

		System.out.println("----------------------------------------------------");
		System.out.println("Search by Billing Zip Code");
		Orders order3 = (Orders) orderslist.stream().filter(x -> x.getBillingAddress().getZipcode() == 20770).findAny()
				.orElse(null);
		System.out.println(order3);

		System.out.println("----------------------------------------------------");
		System.out.println("Search by Shipping Zip Code");
		Orders order4 = (Orders) orderslist.stream().filter(x -> x.getShippingAddress().getZipcode() == 20770).findAny()
				.orElse(null);
		System.out.println(order4);*/

	}
}
