package iuh.fit.ktpm;

public class TestCourse {
    public static void main(String[] args) {
        CourseList courseList = new CourseList(10);
        Course c1 = new Course("FIT101", "Java", 4, "HHH");
        Course c2 = new Course("FIT201", "Database", 3, "UUU");
        Course c3 = new Course("FIT201", "Programming", 3, "FIT");
        courseList.addCourse(c1);
        courseList.addCourse(c2);
        courseList.addCourse(c3);
        for(Course c : courseList.getCourses()){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }
        System.out.println("Find by department: ");
        System.out.println(courseList.fidDepartment("FIT"));
        System.out.println("Find max credit: ");
        for(Course c : courseList.findMaxCredit()){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }

        System.out.println("Add course: ");
        Course c4 = new Course("FIT301", "C++", 5, "FIT");
        courseList.addCourse(c4);
        for(Course c : courseList.getCourses()){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }

        System.out.println("Remove course: ");
        courseList.removeCourse("FIT101");
        for(Course c : courseList.getCourses()){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }

        System.out.println("SortCourse : ");
        courseList.SortCourse();
        for(Course c : courseList.getCourses()){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }
        System.out.println("SearchCourse by title : ");
        for(Course c : courseList.SearchCourse("Java")){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }

        System.out.println("SearchCourse by department : ");
        for(Course c : courseList.SearchCourseByDepartment("FIT")){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }
        System.out.println("SearchCourse by id : ");
        for(Course c : courseList.SearchCourseById("FIT301")){
            if(c != null){
                System.out.println(c.getId() + " - " + c.getTitle() + " - " + c.getDepartment() + " - " + c.getCredit());
            }
        }

    }
}
