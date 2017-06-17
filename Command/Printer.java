import java.util.*;

public class Printer {

 	private Queue jobs;

 	public Printer() {

 		jobs = new LinkedList();
 	}

 	public void registerJob(Object obj) {

 		jobs.add(obj);
 	}

 	public void printJobs(){

		Command job;
 		while( (job = (Command)jobs.poll()) != null)
 			job.execute();
 	}
}