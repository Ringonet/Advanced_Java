import java.lang.annotation.Annotation;

public class TestReflection {
    public static void main(String[] args) {
//        Person person = new Person();

        Class personClass = Person.class;
//        Class personClass2 = person.getClass();
//        Class personClass3 = Class.forName("Person");

//        Method[] methods = personClass.getMethods();
//        for (Method method: methods) {
//            System.out.println(method.getName() + ", "
//                    + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
//        }

//        Field[] fields = personClass.getDeclaredFields();
//        for (Field field: fields) {
//            System.out.println(field.getName() + ", "
//                    + field.getType());
//        }

       Annotation[] annotations =  personClass.getAnnotations();
        for (Annotation annotation: annotations) {
            if(1 > 0) {
                System.out.println("Yes");
            }
        }
    }
}
