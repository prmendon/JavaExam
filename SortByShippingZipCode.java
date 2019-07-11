import java.util.Comparator;

/**
 * 
 */

/**
 * @author Prajna Mendon
 *
 * Modified Date : Jul 11, 2019
 */
public class SortByShippingZipCode implements Comparator<Orders> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Orders o1, Orders o2) {
		// TODO Auto-generated method stub
		return o1.getShippingAddress().getZipcode().compareTo(o2.getShippingAddress().getZipcode());
	}

}
