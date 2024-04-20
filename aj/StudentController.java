
public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentId(int studentId) {
        model.setStudentId(studentId);
    }

    public int getStudentId() {
        return model.getStudentId();
    }

    public void setEnrollmentNumber(int enrollmentNumber) {
        model.setEnrollmentNumber(enrollmentNumber);
    }

    public int getEnrollmentNumber() {
        return model.getEnrollmentNumber();
    }

    public void setSemester(int semester) {
        model.setSemester(semester);
    }

    public int getSemester() {
        return model.getSemester();
    }

    public void setSpi(double spi) {
        model.setSpi(spi);
    }

    public double getSpi() {
        return model.getSpi();
    }

    public void updateView() {
        view.displayStudentDetails(model);
    }

}
