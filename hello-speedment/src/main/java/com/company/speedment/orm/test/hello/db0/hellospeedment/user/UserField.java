package com.company.speedment.orm.test.hello.db0.hellospeedment.user;

import com.speedment.core.field.reference.ComparableReferenceField;
import com.speedment.core.field.reference.string.StringReferenceField;
import javax.annotation.Generated;
import static com.speedment.core.field.FieldUtil.findColumn;

/**
 * Interface representing the fields of an entity.
 * 
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public final class UserField {
    
    public final static ComparableReferenceField<User, Integer> ID = new ComparableReferenceField<>(() -> findColumn(User.class, "id"), User::getId);
    public final static StringReferenceField<User> MAIL = new StringReferenceField<>(() -> findColumn(User.class, "mail"), User::getMail);
    
    private UserField() {
        
    }
}