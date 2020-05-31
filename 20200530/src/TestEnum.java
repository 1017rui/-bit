import java.lang.reflect.Constructor;

/**
 * @author 张瑞瑞
 * @date 2020/05/31 9:41
 * 枚举类
 */
public enum TestEnum {
    //RED,BLACK,GREEN,WHITE;//枚举对象
    RED("red",1),BLACK("black",2),WHITE("white",3),GREEN("green",4);
    private String name;
    private int key;
    TestEnum (String name,int key){
    }
    public static TestEnum getEnumKey (int key) {
        for (TestEnum t: TestEnum.values()) {
            if(t.key == key) {
                return t;
            }
        }
        return null;
    }

    public static void reflectPrivateConstructor() {
        try {
            Class<?> classStudent = Class.forName("TestEnum");
//注意传入对应的参数,获得对应的构造方法来构造对象,当前枚举类是提供了两个参数分别是String和int
            Constructor<?> declaredConstructorStudent =
                    classStudent.getDeclaredConstructor(String.class,int.class);
//设置为true后可修改访问权限
            declaredConstructorStudent.setAccessible(true);
            Object objectStudent = declaredConstructorStudent.newInstance("绿色",666);
            TestEnum testEnum = (TestEnum) objectStudent;
            System.out.println("获得枚举的私有构造函数："+testEnum);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(getEnumKey(2));

    }
    public static void main3(String[] args) {
        //拿到枚举实例BLACK
        TestEnum testEnum = TestEnum.BLACK;
        //拿到枚举实例RED
        TestEnum testEnum21 = TestEnum.RED;
        System.out.println(testEnum.compareTo(testEnum21));
        System.out.println(BLACK.compareTo(RED));
        System.out.println(RED.compareTo(BLACK));
    }
    public static void main2(String[] args) {
        TestEnum [] testEnums = TestEnum.values() ;
        for (int i = 0; i < testEnums.length; i++) {
            System.out.println(testEnums[i] + " " + testEnums[i].ordinal());
        }
        System.out.println("=========================");
        System.out.println(TestEnum.valueOf("GREEN"));
    }
    public static void main1(String[] args) {
        TestEnum testEnum2 = TestEnum.BLACK;
        switch (testEnum2) {
            case RED:
                System.out.println("red");
                break;
            case BLACK:
                System.out.println("black");
                break;
            case WHITE:
                System.out.println("WHITE");
                break;
            case GREEN:
                System.out.println("black");
                break;
            default:
                break;
        }
    }
}