package home.ban;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * Created by Ban on 28.05.2016.
 */
public class SelectCases  {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите путь к файлу (List_of_TestCases.txt)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();

        System.out.println("Введите кол-во тест-кейсов для вывода");
        String countS = reader.readLine();
        int count;
        if (countS.isEmpty()) {
            printList(selectedTestCases(path));
        } else {
            count = Integer.parseInt(countS);
            printList(selectedTestCases(path, count));
        }
    }

    public static ArrayList<String> selectedTestCases(String path, int count) throws Exception {
        ArrayList<String> lines = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        for (int i = 0; i < count; i++) {
            lines.add(reader.readLine());
        }
        return lines;

    }

    public static ArrayList<String> selectedTestCases(String path) throws Exception {
        ArrayList<String> lines = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        for (int i = 0; i < 10; i++) {
            lines.add(reader.readLine());
        }
        return lines;
    }

    public static void printList (ArrayList<String> lines) {
        for (String list : lines) {
            System.out.println(list);
        }
    }
}
