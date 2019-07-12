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
public class SearchByShippingZipCode {

	private static List<Orders> list;

	Stream<Orders> orders = list.stream();

	public static void searchByShippingZipCode(List<Orders> list) {
		Orders order = list.stream().filter(x -> x.getShippingAddress().getZipcode() == 20770).findAny().orElse(null);
		System.out.println(order);
	}

}
