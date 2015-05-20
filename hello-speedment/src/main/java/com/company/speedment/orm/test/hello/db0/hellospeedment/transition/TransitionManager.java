package com.company.speedment.orm.test.hello.db0.hellospeedment.transition;

import com.speedment.core.config.model.Column;
import com.speedment.core.config.model.Table;
import com.speedment.core.core.manager.sql.SqlManager;
import com.speedment.core.platform.Platform;
import com.speedment.core.platform.component.ManagerComponent;
import com.speedment.core.platform.component.ProjectComponent;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;

/**
 * A manager representing an entity (for example, a row) in the Table 'hello.db0.hellospeedment.transition'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public interface TransitionManager extends SqlManager<List<Integer>, Transition, TransitionBuilder> {
    
    @Override
    default List<Integer> primaryKeyFor(Transition entity) {
        return Arrays.asList(entity.getFrom(), entity.getTo());
    }
    
    @Override
    default Table getTable() {
        return Platform.get().get(ProjectComponent.class).getProject().findTableByName("db0.hellospeedment.transition");
    }
    
    @Override
    default Class<TransitionManager> getManagerClass() {
        return TransitionManager.class;
    }
    
    @Override
    default Class<Transition> getEntityClass() {
        return Transition.class;
    }
    
    @Override
    default Class<TransitionBuilder> getBuilderClass() {
        return TransitionBuilder.class;
    }
    
    @Override
    default Object get(Transition entity, Column column) {
        switch (column.getName()) {
            case "from" : return entity.getFrom();
            case "to" : return entity.getTo();
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @Override
    default void set(TransitionBuilder entity, Column column, Object value) {
        switch (column.getName()) {
            case "from" : entity.setFrom((Integer) value); break;
            case "to" : entity.setTo((Integer) value); break;
            default : throw new IllegalArgumentException("Unknown column '" + column.getName() + "'.");
        }
    }
    
    @SuppressWarnings("unchecked")
    static TransitionManager get() {
        return Platform.get().get(ManagerComponent.class).manager(TransitionManager.class);
    }
}