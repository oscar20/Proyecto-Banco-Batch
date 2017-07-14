package com.beeva.springbatch.Bancobatch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Ejecutando Spring Batch......" );
        ApplicationContext context = new ClassPathXmlApplicationContext("job-simple.xml");
    	JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
    	Job job = (Job) context.getBean("processFileJob");
    	
    	try {
			JobExecution exe = jobLauncher.run(job, new JobParameters());
			System.out.println("Status: "+exe.getStatus());
		} catch (Exception e) {
		
		}
        
    }
}
