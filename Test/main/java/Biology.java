public class Biology{
    private String sex;
    private int age;
    public Biology(String mysex, int myage) {
        sex = mysex;
        age = myage;
    }
    public String Sex(){
        return "My sex is "+sex;
    }
    public String Age(){
        return "My age is "+age;
    }

    public String introduction() {
        return "大家好！我的性别是"+ sex + "。年龄是" + age + "。";
    }

    @Override
    public String toString() {
        return "Biology{" +"sex='" + sex + '\'' +", age=" + age +'}';
    }
}