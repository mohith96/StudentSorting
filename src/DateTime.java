import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DateTime {

	public static void main(String[] args) throws ParseException {
		
	
		
		List name = Arrays.asList("Reflection","Collection","Stream");
		List result = (List) name.stream().sorted().collect(Collectors.toList());
		
		System.out.println(result);
		
		List names = Arrays.asList("Reflection","Collection","Stream");
		List result1 = (List) names.stream().filter(s->((String) s).startsWith("S")).collect(Collectors.toList());
		System.out.println(result1);
	}
}