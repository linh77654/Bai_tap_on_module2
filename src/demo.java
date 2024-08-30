//package repository.student_Repo;
//
//import model.Student;
//import ulit.ReadAndWrite;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentRepo implements IStudentRepo {
//
//    public static final String PATH = "src/data/student.csv";
//
//    @Override
//    public List<Student> findAll() {
//        List<String> stringList = ReadAndWrite.readFileCSVToListString(PATH);
//        List<Student> studentList = new ArrayList<>();
//        for (String s : stringList) {
//            String[] array = s.split(",");
//            Student student = new Student(array[0], array[1], LocalDate.parse(array[2]), array[3],
//                    array[4], array[5]);
//            studentList.add(student);
//        }
//        return studentList;
//    }
//
//    @Override
//    public void addStudent(Student student) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add(student.getInfoToCSV());
//        ReadAndWrite.writeStringListToFile(PATH, stringList, true);
//    }
//
//    @Override
//    public void updateStudent(String id, Student updatedStudent) {
//        List<Student> studentList = findAll();
//        for (Student student : studentList) {
//            if (student.getId().equals(id)) {
//                student.setName(updatedStudent.getName());
//                student.setBirthday(updatedStudent.getBirthday());
//                student.setEmail(updatedStudent.getEmail());
//                student.setPhoneNumber(updatedStudent.getPhoneNumber());
//                student.setClassName(updatedStudent.getClassName());
//                break;
//            }
//        }
//        saveAllStudents(studentList);
//    }
//
//    @Override
//    public Student findStudentById(String id) {
//        List<Student> studentList = findAll();
//        for (Student student : studentList) {
//            if (student.getId().equals(id)) {
//                return student;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public boolean deleteStudent(String id) {
//        List<Student> studentList = findAll();
//        boolean isDeleted = false;
//
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getId().equals(id)) {
//                studentList.remove(i);
//                isDeleted = true;
//                break;
//            }
//        }
//        if (isDeleted) {
//            saveAllStudents(studentList);
//        }
//        return isDeleted;
//    }
//
//
//    private void saveAllStudents(List<Student> studentList) {
//        List<String> stringList = new ArrayList<>();
//        for (Student student : studentList) {
//            stringList.add(student.getInfoToCSV());
//        }
//        ReadAndWrite.writeStringListToFile(PATH, stringList, false);
//    }
//}
//
