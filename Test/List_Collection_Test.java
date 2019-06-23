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

    public void Add_List_Collection_Test (){
        Course_Collection_Test course_1=new Course_Collection_Test("1","数据结构");
        Course_to_Select.add(course_1);
        Course_Collection_Test Temp_1=(Course_Collection_Test)Course_to_Select.get(0);
        System.out.println("添加了课程："+Temp_1.getID()+":"+Temp_1.getName());

        Course_Collection_Test course_2=new Course_Collection_Test("2","C语言");
        Course_to_Select.add(course_2);
        Course_Collection_Test Temp_2=(Course_Collection_Test)Course_to_Select.get(1);
        System.out.println("添加了课程："+Temp_2.getID()+":"+Temp_2.getName());
    }
}
