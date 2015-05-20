package com.company.speedment.orm.test.hello.db0.hellospeedment.image;

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
public final class ImageField {
    
    public final static ComparableReferenceField<Image, Integer> ID = new ComparableReferenceField<>(() -> findColumn(Image.class, "id"), Image::getId);
    public final static StringReferenceField<Image> TITLE = new StringReferenceField<>(() -> findColumn(Image.class, "title"), Image::getTitle);
    public final static StringReferenceField<Image> DESCRIPTION = new StringReferenceField<>(() -> findColumn(Image.class, "description"), Image::getDescription);
    public final static ComparableReferenceField<Image, Integer> AUTHOR = new ComparableReferenceField<>(() -> findColumn(Image.class, "author"), Image::getAuthor);
    public final static ComparableReferenceField<Image, Timestamp> PUBLISHED = new ComparableReferenceField<>(() -> findColumn(Image.class, "published"), Image::getPublished);
    public final static StringReferenceField<Image> SRC = new StringReferenceField<>(() -> findColumn(Image.class, "src"), Image::getSrc);
    
    private ImageField() {
        
    }
}