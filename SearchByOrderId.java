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
public class SearchByOrderId {

	private static HashSet<Orders> orderslist ;
	private static List<Orders> list;
	
	Stream<Orders> orders = orderslist.stream();
	
	public static void searchByOrderId(List<Orders> list) {
		Orders order = list
				.stream()
				.filter(x -> x.getOrderId() == 1001)
				.findAny()
				.orElse(null);
		System.out.println(order);
	}
}
