import java.util.ArrayList;

public class Department {
    private String code;
    private String description;
    private ArrayList<Officer> officers;

    public Department(String code, String description) {
        this.code = code;
        this.description = description;
        this.officers = new ArrayList<>();
    }

    public boolean addOfficer(Officer officer) {
        officer.setDepartment(this);
        return officers.add(officer);
    }

    public Officer remove(int index) {
        Officer e = officers.get(index);
        if()
        return officers.remove(index);
    }

    public boolean contains(Object o) {
        return officers.contains(o);
    }
}
