package org.example;

public class BMITracker {
	
	private float weight;
	private float height;
	private float bmical;
	private String classify;
	
	public void calculateBMI() {
		
		bmical=weight/(height*height);
		
	}

	public void classifyBMI() {
		
		if(bmical<18.5) {
			classify = "Underweight";
		}
		else if(bmical>=18.5 && bmical<=24.9) {
			classify = "Normal weight";
		}
		else if(bmical>=25 && bmical<29.9){
			classify = "Overweight";
		}
		else {
			classify = "Obese";
		}
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	public String getClassify() {
		return classify;
	}

	/*public void printRecord() {
		System.out.println(classify);
		
	}*/

}
