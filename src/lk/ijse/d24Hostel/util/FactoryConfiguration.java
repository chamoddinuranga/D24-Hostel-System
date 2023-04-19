package lk.ijse.d24Hostel.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
/*Why do we make FactoryConfiguration class into singleton-> Making the FactoryConfiguration class a singleton ensures
            that only one instance of the class is created and used throughout the application . This helps to prevent
    multiple instances of the SessionFactory from being created, which can cause problems with resource allocation and
    management. (Limit the creating of objects)*/

    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

/* Why do we use 'configure()' here - to configure details of hibernate.cfg.xml file here*/
    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                ;

        sessionFactory = configuration.buildSessionFactory();
    }
    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                : factoryConfiguration;
    }
    public Session getSession() {
        return sessionFactory.openSession();
    }
}

