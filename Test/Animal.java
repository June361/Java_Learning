public class Animal extends Biology{
    private String name;
    private int id;
    public Animal(String myName, int myid,String mySex,int myAge) {
        super(mySex,myAge);
        name = myName;
        id = myid;
    }
    public String eat(){
        return name+"正在吃";
    }
    public String sleep(){
        return name+"正在睡";
    }
    @Override
    public String introduction() {
        return "大家好！我是"+ id + "号" + name + "。";
    }
}