package pers.amanorenard.homeworks.dailytraining.y22m6.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Employee> empls = new ArrayList<>();
        empls.add(new Employee("001", "卢本伟", 28, '男', "电竞科", 6666));
        empls.add(new Employee("002", "PDD", 30, '男', "电竞科", 2333));
        empls.add(new Employee("003", "大司马", 26, '男', "电竞科", 5555));
        empls.add(new Employee("004", "蔡徐坤", 20, '女', "娱乐科", 114514));
        empls.add(new Employee("005", "周淑怡", 27, '女', "娱乐科", 100000));
        empls.add(new Employee("006", "吴亦凡", 22, '男', "娱乐科", 1265812));

        Map<String, Map<String, List<Employee>>> emplsMap = empls.stream().collect(
                Collectors.groupingBy(Employee::getSection, Collectors.groupingBy(c -> Character.valueOf(c.getSex()).toString()))
        );
        for (String i : emplsMap.keySet()) {
            System.out.println("【" + i + "】");
            for (String j : emplsMap.get(i).keySet()) {
                System.out.println("\t【" + j + "】");
                emplsMap.get(i).get(j).forEach(
                        e -> System.out.printf(
                                "\t\t%s, %c, %d Year-old, member of %s.\n\t\t┗Salary: $%.2f per month.\n",
                                e.getName(), e.getSex(), e.getAge(), e.getSection(), e.getSalary()
                        )
                );
            }
        }
        System.out.printf("平均工资：$%.2f\n",
                empls.stream().collect(Collectors.averagingDouble(Employee::getSalary))
        );
    }
}
