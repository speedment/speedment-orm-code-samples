package com.company.speedment.orm.test.hello.db0.hellospeedment.visit;

import com.speedment.core.field.reference.ComparableReferenceField;
import com.speedment.core.field.reference.string.StringReferenceField;
import java.sql.Timestamp;
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
public final class VisitField {
    
    public final static ComparableReferenceField<Visit, Integer> ID = new ComparableReferenceField<>(() -> findColumn(Visit.class, "id"), Visit::getId);
    public final static ComparableReferenceField<Visit, Timestamp> TIME = new ComparableReferenceField<>(() -> findColumn(Visit.class, "time"), o -> o.getTime().orElse(null));
    public final static ComparableReferenceField<Visit, Integer> USER = new ComparableReferenceField<>(() -> findColumn(Visit.class, "user"), o -> o.getUser().orElse(null));
    public final static StringReferenceField<Visit> IMAGE = new StringReferenceField<>(() -> findColumn(Visit.class, "image"), o -> o.getImage().orElse(null));
    
    private VisitField() {
        
    }
}