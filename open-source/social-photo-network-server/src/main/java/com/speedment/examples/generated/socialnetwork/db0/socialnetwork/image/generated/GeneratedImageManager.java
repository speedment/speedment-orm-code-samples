package com.speedment.examples.generated.socialnetwork.db0.socialnetwork.image.generated;

import com.speedment.examples.generated.socialnetwork.db0.socialnetwork.image.Image;
import com.speedment.runtime.core.manager.Manager;
import javax.annotation.Generated;

/**
 * The generated base interface for the manager of every {@link
 * com.speedment.examples.generated.socialnetwork.db0.socialnetwork.image.Image}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedImageManager extends Manager<Image> {
    
    @Override
    default Class<Image> getEntityClass() {
        return Image.class;
    }
}