package com.company.speedment.orm.test.hare.db0.hares.human;

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
public final class HumanField {
    
    public final static ComparableReferenceField<Human, Integer> ID = new ComparableReferenceField<>(() -> findColumn(Human.class, "id"), Human::getId);
    public final static StringReferenceField<Human> NAME = new StringReferenceField<>(() -> findColumn(Human.class, "name"), o -> o.getName().orElse(null));
    
    private HumanField() {
        
    }
}