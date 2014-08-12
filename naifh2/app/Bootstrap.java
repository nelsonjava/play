import play.test.*;
import play.jobs.*;
import models.com.naif.domains.models.*;

/*
play crud:ov --template SystemModel/list
play crud:ov --template SystemModel/show
play dependencies
*/

@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {
        // Load default data if the database is empty
        if(SystemsModels.count() == 0) {
            Fixtures.load("initial-data.yml");
        }
    }
    
}