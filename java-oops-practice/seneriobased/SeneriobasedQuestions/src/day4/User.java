package day4;

public class User {
	
	protected String name;
	private String age;
	private String adoptedPetType;
	private String adoptedPetName;
	private Pet adoptedPet;
	
	
	public User(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public void adoptPet(Pet pet) {
		this.adoptedPet = pet;
		this.adoptedPetType = pet.getClass().getSimpleName();
		this.adoptedPetName = pet.getName();
	}
	
	public void showAdoptedPet() {
		System.out.println(name + " Adopted " + adoptedPetType + " of name " + adoptedPetName);
	}
	
	public void interactWithPet() {
        adoptedPet.makeSound();
        adoptedPet.feed();
        adoptedPet.play();
        adoptedPet.sleep();
        adoptedPet.showStatus();
    }

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
