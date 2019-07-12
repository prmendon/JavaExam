import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author Prajna Mendon
 *
 * Modified Date : Jul 11, 2019
 */
public class SearchByBillingZipCode {
	private static HashSet<Orders> orderslist ;
	private static List<Orders> list;
	
	Stream<Orders> orders = orderslist.stream();
	
	public static void searchByBillingZipCode(List<Orders> list) {
		Orders order = list
				.stream()
				.filter(x -> x.getBillingAddress().getZipcode() == 20770)
				.findAny()
				.orElse(null);
		System.out.println(order);
	}

}
