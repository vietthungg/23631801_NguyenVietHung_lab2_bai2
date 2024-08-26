package iuh.fit.ktpm;

public class CourseList {
    private Course[] courses;
    public static int count =0 ;
    public CourseList(int n) {
        if(n<0) throw new IllegalArgumentException("the number of courses is negative");
        courses = new Course[n];
    }

    /**
     *  them 1 khoa hoc vao danh sach
     *  neu khoa hoc da ton tai thi khong them vao
     * @param course
     * @return
     */
    public boolean addCourse(Course course) {
        if(course == null) return false;

        if(isExisted(course))
            return false;

        if(count < courses.length){
            courses[count++] = course;
            return true;
        }
        return false;
    }

    /** kiem tra khoa hoc da ton tai chua
     * neu da ton tai thi tra ve true
     * nguoc lai tra ve false
     * @param course
     * @return
     */
    private boolean isExisted(Course course) {
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].equals(course)) return true;
        }
        return false;
    }

    /** tim cac khoa hoc theo bo mon
     *  neu khong co khoa hoc nao thi tra ve chuoi rong
     *  nguoc lai tra ve danh sach cac khoa hoc
     * @param department
     * @return
     */
    public String fidDepartment(String department) {
        String result = "";
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getDepartment().equals(department)){
                result += courses[i].toString() + "\n";
            }
        }
        return result;
    }

    /**
     *  tim cac khoa hoc co so tin chi lon nhat
     * @return
     */
    public Course[] findMaxCredit() {
        int max = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getCredit() > max){
                max = courses[i].getCredit();
            }
        }
        int count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getCredit() == max){
                count++;
            }
        }
        Course[] result = new Course[count];
        count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getCredit() == max){
                result[count++] = courses[i];
            }
        }
        return result;
    }

    /**
     * xoa 1 khoa hoc theo ma khoa hoc
     * @param id
     * @return
     */
    public boolean removeCourse(String id) {
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getId().equals(id)){
                courses[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * tim cac khoa hoc theo ten
     * @param title
     * @return
     */
    public Course[] SearchCourse(String title) {
        int count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getTitle().contains(title)){
                count++;
            }
        }
        Course[] result = new Course[count];
        count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getTitle().contains(title)){
                result[count++] = courses[i];
            }
        }
        return result;
    }

    /** tim cac khoa hoc theo bo mon
     * @param department
     * @return
     */
    public Course[] SearchCourseByDepartment(String department) {
        int count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getDepartment().contains(department)){
                count++;
            }
        }
        Course[] result = new Course[count];
        count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getDepartment().contains(department)){
                result[count++] = courses[i];
            }
        }
        return result;
    }

    /**
     *  tim cac khoa hoc theo ma khoa hoc
     * @param id
     * @return
     */
    public Course[] SearchCourseById(String id) {
        int count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getId().contains(id)){
                count++;
            }
        }
        Course[] result = new Course[count];
        count = 0;
        for(int i = 0 ; i < courses.length ; i++){
            if(courses[i] != null && courses[i].getId().contains(id)){
                result[count++] = courses[i];
            }
        }
        return result;
    }

    /**
     * sap xep cac khoa hoc theo ten
     * @return
     */
    public Course SortCourse() {
        Course temp;
        for(int i = 0 ; i < courses.length - 1 ; i++){
            for(int j = i + 1 ; j < courses.length ; j++){
                if(courses[i] != null && courses[j] != null && courses[i].getTitle().compareTo(courses[j].getTitle()) > 0){
                    temp = courses[i];
                    courses[i] = courses[j];
                    courses[j] = temp;
                }
            }
        }
        return courses[0];
    }
    public Course[] getCourses() {return courses;}

}
