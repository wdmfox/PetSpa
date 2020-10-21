package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Pet {
	private String type;
	private String breed;
	private String petName;
	private int weight;
	
	public Pet () {
		
	}
	
	public Pet (String type, String breed, String petName, int weight) {
		this.type = type;
		this.breed = breed;
		this.petName = petName;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getPetName() {
		return petName;
	}

	public void setName(String petName) {
		this.petName = petName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Pet [type=" + type + ", breed=" + breed + ", petName=" + petName + ", weight=" + weight + "]";
	}
}
