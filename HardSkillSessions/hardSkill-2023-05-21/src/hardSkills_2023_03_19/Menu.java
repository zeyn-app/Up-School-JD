package hardSkills_2023_03_19;

import java.util.Arrays;

public class Menu {
	private Meal[] meals = new Meal[10];
	private int count = 0;

	public void addMeal(Meal meal) {
		meals[count] = meal;
		count++;
	}

	public void removeMeal(int index) {

	}

	public void removeMeal(Meal meal) {
		int index = -1;
		for (int i = 0; i < count; i++) {
			if (meals[i].equals(meal)) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			for (int i = index; i < count; i++) {
				meals[i] = meals[i + 1];
			}
			meals[count - 1] = null;
			count--;
		} else {
			System.out.println("Yemek bulunamadı.");
		}
	}

	public void printAllMeal() {
		for (int i = 0; i < count; i++) {
			Meal meal = meals[i];
			System.out.println("\nYemek adı: " + meal.getName() + "\nÜcreti: " + meal.getPrice() + "\nİçindekiler: "
					+ Arrays.toString(meal.getIngredients()) + "\nKalori: " + meal.getCalories() + "\nVegan: "
					+ (meal.isVegan() ? "EVET" : "HAYIR"));
		}
	}
}
