package JAVABEANejb;

import java.beans.*;

public class SimpleBeanIntrospection {
    public static void main(String[] args) throws IntrospectionException{
        BeanInfo beanInfo = Introspector.getBeanInfo(StudentBean.class);

        // Inspect Properties
        for(PropertyDescriptor property : beanInfo.getPropertyDescriptors()){
            System.out.println("Property: "+ property.getName());
        }

        // Inspect Methods
        for(MethodDescriptor method : beanInfo.getMethodDescriptors()){
            System.out.println("Method: "+method.getName());
            System.out.println(method.getMethod().getDeclaringClass());
        }

        // Inspect Events
        for(EventSetDescriptor event : beanInfo.getEventSetDescriptors()){
            System.out.println("Event: "+event.getName());
        }
    }
}
