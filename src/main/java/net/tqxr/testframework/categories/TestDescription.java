package net.tqxr.testframework.categories;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE) //can use in method only.
public @interface TestDescription {
String value() default "No description provided.";
}
