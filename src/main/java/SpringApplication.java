import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Domain;
import model.Employee;
import model.Manager;

/**
 * @author vagrant
 *
 */
public class SpringApplication {

	public static void getRunTimeObject(Domain domain) {
		System.out.println(domain.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringContext.xml");
		Employee employee = (Employee) context.getBean("employee");
		getRunTimeObject(employee);
		getRunTimeObject(new Manager());
	}
}
