import java.util.List;
import java.util.Map;

public class CustomerService {

    public static List<Customer> allCustomers;
    public static Map<String, Customer> customerMap;

    
    public static void addCustomer(String email, String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName, email);
        allCustomers.add(customer);   
        customerMap.put(email, customer);     
    }

    public static Customer getCustomer(String customerEmail){
        return customerMap.get(customerEmail);
    }

    public static List<Customer> getAllCustomers(){
        return allCustomers;
    }
}

