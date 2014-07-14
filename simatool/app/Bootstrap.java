import play.test.*;
import play.jobs.*;
import models.com.naif.domains.models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {
        // Load default data if the database is empty
        if(SystemsModels.count() == 0) {
            Fixtures.load("initial-data.yml");
        }
    }
    
}