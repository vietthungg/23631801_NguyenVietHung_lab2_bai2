package iuh.fit.ktpm;

public class Course {
        private String id;
        private String title;
        private int credit;
        private String department;
        public Course() {
            this("", "", 0, "");
        }
        public Course(String id, String title, int credit, String department) {
            this.id = id;
            this.title = title;
            this.credit = credit;
            this.department = department;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredit() {
        if(credit < 0) throw new IllegalArgumentException("credit cannot be negative");

        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString() {
        return String.format("%-10s%-30s%5d  %-15s", id, title, credit, department);
    }

}
