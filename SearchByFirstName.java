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
public class SearchByFirstName {

	private static HashSet<Orders> orderslist ;
	private static List<Orders> list;
	
	Stream<Orders> orders = orderslist.stream();
	
	public static void searchByFirstName(List<Orders> list) {
		Orders order = list
				.stream()
				.filter(x -> "ABDC".equals(x.getCustomer().getFirstName()))
				.findAny()
				.orElse(null);
		System.out.println(order);
	}
	
	
	
	
	
}
