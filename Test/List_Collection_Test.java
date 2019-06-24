import java.util.ArrayList;
import java.util.List;

public class List_Collection_Test{

    private List Course_to_Select;

    public List getCourse_to_Select() {
        return this.Course_to_Select;
    }

    private void setID(List Course_to_Select){
        this.Course_to_Select=Course_to_Select;
    }

    public List_Collection_Test (){
        this.Course_to_Select=new ArrayList();
    }
}
