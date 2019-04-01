import java.util.Scanner;

public class workDog extends Dog
{
	private String occupation;
    private Boolean inTraining;
    private String trainer;
    private int yearsOfService;

    public workDog(String name,String job)
    {
		super(name);
		occupation = job;
		inTraining = false;
		trainer = null;
		yearsOfService = 0;
	}

	public workDog(String name,String breed,String job)
	    {
			super(name,breed);
			occupation = job;
			inTraining = false;
			trainer = null;
			yearsOfService = 0;
	}

	public workDog(String name, String job, String trainer)
	{
		super(name);
		occupation = job;
		inTraining = false;
		trainer = trainer;
		yearsOfService = 0;
	}

	public workDog(String job, Boolean training, String trainer, int YOS)
	{
		super();
		occupation = job;
		inTraining = training;
		trainer = trainer;
		yearsOfService = YOS;
	}
 }
