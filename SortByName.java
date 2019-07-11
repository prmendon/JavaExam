import java.util.Comparator;

/**
 * 
 */

/**
 * @author Prajna Mendon
 *
 * Modified Date : Jul 10, 2019
 */
public class SortByName implements Comparator<Orders>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Orders o1, Orders o2) {
		// TODO Auto-generated method stub
		return o1.getCustomer().getFirstName().compareTo(o2.getCustomer().getFirstName());
	}

	

}
