//WAP to implement the tree map with two keys and multiple values associated to keys
import java.util.TreeMap;
public class treemapdemo {
// TreeMap code here
public static void main(String[] args) {
    TreeMap<String, TreeMap<String, String>> studentDetails = new TreeMap<>();
    // Add student details to the TreeMap
    TreeMap<String, String> details1 = new TreeMap<>();
    details1.put("Name", "Deepak");
    details1.put("Roll No", "123");
    details1.put("Age", "20");
    details1.put("Phone Number", "1234567890");
    details1.put("Email", "john.doe@example.com");
    studentDetails.put("Student2", details1);
    
    TreeMap<String, String> details2 = new TreeMap<>();
    details2.put("Name", "Anil");
    details2.put("Roll No", "124");
    details2.put("Age", "21");
    details2.put("Phone Number", "0987654321");
    details2.put("Email", "jane.smith@example.com");
    studentDetails.put("Student1", details2);
    // Display student details
    for (String studentId : studentDetails.keySet()) {
        System.out.println("Student ID: " + studentId);
        TreeMap<String, String> details = studentDetails.get(studentId);
        for (String key : details.keySet()) {
            System.out.println(key + ": " + details.get(key));
        }
        System.out.println();
    }   
}
}
