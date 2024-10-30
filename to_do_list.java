import java.util.ArrayList;
import java.util.Scanner;

public class to_do_list {
	public static void main(String[] args) {
		ArrayList<String> tasks = new ArrayList<>();
		ArrayList<Boolean> task_status = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		int choice;

		do {
			System.out.println("-------------- To-Do List ---------------");
			System.out.println("1. Add Task");
			System.out.println("2. Remove Task");
			System.out.println("3. Mark Task Complete");
			System.out.println("4. View Tasks");
			System.out.println("5. Exit!");
			System.out.print("Choose: ");
			choice = input.nextInt();
			input.nextLine();

			if (choice == 1) {
				System.out.print("Enter task: ");
				String task = input.nextLine();
				tasks.add(task);
				task_status.add(false);
				System.out.println("Task added...");
			} else if (choice == 2) {
				System.out.print("Enter number to remove task: ");
				int task_number = input.nextInt() - 1;
				if (task_number >= 0 && task_number < tasks.size()) {
					tasks.remove(task_number);
					task_status.remove(task_number);
					System.out.println("Task remove...");
				} else {
					System.out.println("Invalid task number.");
				}
			} else if (choice == 3) {
				System.out.print("Enter task: ");
				int task_number = input.nextInt() - 1;
				if (task_number >= 0 && task_number < tasks.size()) {
					task_status.set(task_number, true);
					System.out.println("Task marked as complete.");
				} else {
					System.out.println("Invalid task number.");
				}
			} else if (choice == 4) {
				System.out.println("To-Do List:");
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println((i + 1) + ". " + tasks.get(i) + (task_status.get(i) ? " (Completed)" : ""));
				}
			}
		} while (choice != 5);
		input.close();
	}
}