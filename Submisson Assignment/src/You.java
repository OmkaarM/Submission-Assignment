/**
 * 
 * @author //Put your first and last name here
 * 
 * 
 * Assignment Instructions:
 * 	Write the following constructors and methods:
 * 	- You() : Sets all private global variables to your information
 * 	- String getFullName() : Returns a String of your first and last name with a space in between
 * 	- String setFavoriteAnimal(String animal) : Sets favoriteAnimal to animal and returns it 
 * 	- int happyBirthday() : Prints out "Happy Birthday!", increases age by 1, and returns it
 *
 * Submission Instructions:
 *  - Save your saved work on Eclipse - your workspace should be the file location of the cloned repo
 *  - In GitHub Desktop, add your summary and commit your changes
 *  - Then push your commits to GitHub
 *  - Check your repo on GitHub.com to make sure the files are as you intend
 *  - Add achiu-frhsd as a collaborator
 *
 */
public class You{

	private String firstName= "Omkaar";
	private String lastName = "Mahadevan";
	private String favoriteAnimal = "carribean reef shark";
	private String animal;
	private int age = 15;
	String FullName= null;
    
	public You() {
		// TODO Auto-generated constructor stub
		
		
	}
	public String getFullName()
	{
	FullName = firstName + " ";
	return FullName +=lastName;
}
	public String setFavoriteAnimal(String animal, String favoriteAnimal)
	{
		animal = favoriteAnimal;
		return animal;
		
	}
	public int happyBirthday()
	{
		System.out.println("Happy Birthday");
		age++;
		return age;
		
	}
	
	public String toSt() 
    { 
        return("Hi my name is "+ this.getFullName()+     ", "+ " favorite animal and age after birthday: "+ this.setFavoriteAnimal(animal ,favoriteAnimal)+"," + this.happyBirthday() ); 
               
    } 
	
	public static void main(String[] args) {
		
        You Omkaar = new You();
        
        System.out.println(Omkaar.toSt());

	}
	
}

