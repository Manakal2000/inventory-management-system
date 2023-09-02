package Controllers;

import Models.Jobs;
import DatabaseAccsesLayer.JobsAccseslogic;


public class jobsController {

    Jobs jobsobj;
   JobsAccseslogic jal;

    public jobsController() {
        jal = new JobsAccseslogic();
    }

    public Jobs addjobs(String jobID,String Jobname, String Date, String Email, String Address, int salary) {
        jobsobj = new Jobs(jobID,Jobname, Date, Email, Address, salary);
        return jobsobj;
    }

    public boolean AddiJobsDB(Jobs jobs) {
          boolean result = jal.AddiJobsDB(jobs);
        return result;
    }
    
    public boolean UpdateJobsDB(Jobs jobs) {
          boolean result = jal.UpdateJobsDB(jobs);
        return result;
    }
    
    public boolean DeleteJobsDB (Jobs jobs) {
          boolean result = jal.DeleteJobsDB(jobs);
        return result;
    }

}
