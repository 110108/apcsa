import java.util.Scanner;

public class workDog
{
	private String occupation;
    private Boolean inTraining;
    private String trainer;
    private int yearsOfService;

    public workDog(String job)
    {
		occupation = job;
		inTraining = false;
		trainer = null;
		yearsOfService = 0;
	}

	public workDog(String job, String trainer)
	{
		occupation = job;
		inTraining = false;
		trainer = trainer;
		yearsOfService = 0;
	}

	public workDog(String job, Boolean training, String trainer, int YOS)
	{
		occupation = job;
		inTraining = training;
		trainer = trainer;
		yearsOfService = YOS;
	}
 }
