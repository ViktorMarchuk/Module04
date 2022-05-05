package by.epam.level04.task05;

public class Logic {
	public int inc(int min, int max, int current) {
		current++;
		if (current > max) {
			current = min;
		}
		return current;

	}

	public int dec(int min, int max, int current) {
		current--;
		if (current < min) {
			current = max;
		}
		return current;

	}

	public void inc(Count countDefault) {
		// TODO Auto-generated method stub
		
	}

}
