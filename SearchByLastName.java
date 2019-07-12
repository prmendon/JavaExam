import java.util.List;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author Prajna Mendon
 *
 *         Modified Date : Jul 11, 2019
 */
public class SearchByLastName {

	private static List<Orders> list;

	Stream<Orders> orders = list.stream();

	public static void searchByLastName(List<Orders> list) {
		Orders order = list.stream().filter(x -> "ABDC".equals(x.getCustomer().getLastName())).findAny().orElse(null);
		System.out.println(order);
	}

}
