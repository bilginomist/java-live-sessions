package homeworks.hw03_maps;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();

        {
            employeeMap.put("Ddene", "F");

            employeeMap.put("Winfred", "M");

            employeeMap.put("Jereme", "M");

            employeeMap.put("Glad", "F");

            employeeMap.put("Desirae", "F");

            employeeMap.put("Kakalina", "F");

            employeeMap.put("Bertrando", "M");

            employeeMap.put("Ajay", "F");

            employeeMap.put("Brigitte", "F");

            employeeMap.put("Derk", "M");

            employeeMap.put("Orlando", "M");

            employeeMap.put("Selle", "F");

            employeeMap.put("Marika", "F");

        }

        //kadın ve erkek sayısı

        {
            int femaleCounter = 0;
            for (String value : employeeMap.values()) {

                if (value.equalsIgnoreCase("F"))
                    femaleCounter++;

            }


            System.out.println(femaleCounter);

            System.out.println(employeeMap.size() - femaleCounter);
        }


        //kadın çalışanların isimleri

        {
            for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

                if (entry.getValue().equalsIgnoreCase("F")) {
                    System.out.println(entry.getKey());
                }
            }
        }

        //tüm M ler (Male) tüm F ler (Female)

        {
            for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

                if (entry.getValue().equalsIgnoreCase("F")) {
                    employeeMap.put(entry.getKey(), "Female");
                    //    employeeMap.put("Ddene", "Female");
                } else {
                    employeeMap.put(entry.getKey(), "Male");
                    //employeeMap.put("Winfred", "Male");
                }
            }

            System.out.println(employeeMap);
        }

    }
}
