package com.github.pyknic.sauna.booking.generated;

import com.github.pyknic.sauna.booking.Booking;
import com.github.pyknic.sauna.booking.BookingImpl;
import com.github.pyknic.sauna.booking.BookingManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.github.pyknic.sauna.booking.Booking} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedBookingManagerImpl 
extends AbstractManager<Booking> 
implements GeneratedBookingManager {
    
    private final TableIdentifier<Booking> tableIdentifier;
    
    protected GeneratedBookingManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("db0", "sauna", "booking");
    }
    
    @Override
    public Booking create() {
        return new BookingImpl();
    }
    
    @Override
    public TableIdentifier<Booking> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Booking>> fields() {
        return BookingManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Booking>> primaryKeyFields() {
        return Stream.of(
            Booking.ID
        );
    }
}