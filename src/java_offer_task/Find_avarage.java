package java_offer_task;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Find_avarage {
	public static double find_average(int[] array){
		if (array.length==0){
			return 0;
		}else {
			int sum=0;
			for (int i:array){
				sum+=i;
			}
			return (double) sum/array.length;
		}
	}
}

