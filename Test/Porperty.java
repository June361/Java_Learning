public class Porperty {
    public class Employee {
        //声明两个私有字段
        private String name;

        private int age;

        //分别实现set和get方法
        public void setName(String name)
        {
            this.name= name;
        }

        public String getName()
        {
            return this.name;
        }

        public void setAge(int age)
        {
            this.age= age;
        }

        public int getAge()
        {
            return this.age;
        }
    }
}
