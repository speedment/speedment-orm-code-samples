package com.speedment.example.securerest.db.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.example.securerest.db.SpeedmentApplication;
import com.speedment.example.securerest.db.SpeedmentApplicationBuilder;
import com.speedment.example.securerest.db.SpeedmentApplicationImpl;
import com.speedment.example.securerest.db.SpeedmentInjectorProxy;
import com.speedment.example.securerest.db.account.AccountManagerImpl;
import com.speedment.example.securerest.db.account.AccountSqlAdapter;
import com.speedment.runtime.application.AbstractApplicationBuilder;
import com.speedment.runtime.connector.mysql.MySqlBundle;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named speedment.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedSpeedmentApplicationBuilder extends AbstractApplicationBuilder<SpeedmentApplication, SpeedmentApplicationBuilder> {
    
    protected GeneratedSpeedmentApplicationBuilder() {
        super(SpeedmentApplicationImpl.class, GeneratedSpeedmentMetadata.class);
        withManager(AccountManagerImpl.class);
        withComponent(AccountSqlAdapter.class);
        withBundle(MySqlBundle.class);
        withInjectorProxy(new SpeedmentInjectorProxy());
    }
    
    @Override
    public SpeedmentApplication build(Injector injector) {
        return injector.getOrThrow(SpeedmentApplication.class);
    }
}