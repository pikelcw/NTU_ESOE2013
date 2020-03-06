
public class Pizza {
	private String Size;
	private int NumberofCheese;
	private int NumberofPepperroni;
	private int NumberofHam;
	
	public Pizza (){
		Size="small";
		NumberofCheese=1;
		NumberofPepperroni=1;
		NumberofHam=1;
	}
	public Pizza (String size,int NoCheese,int NoPepperroni,int NoHam){
		Size=size;
		NumberofCheese=NoCheese;
		NumberofPepperroni=NoPepperroni;
		NumberofHam=NoHam;
	}
	
	public Pizza (Pizza pizza){
		Size=pizza.getSize();
		NumberofCheese=pizza.getNumberofCheese();
		NumberofPepperroni=pizza.getNumberofPepperroni();
		NumberofHam=pizza.NumberofHam;
	}
	
	public String getSize(){
		return Size;
	}
	public int getNumberofCheese(){
		return NumberofCheese;
	}
	public int getNumberofPepperroni(){
		return NumberofPepperroni;
	}
	public int getNumberofHam(){
		return NumberofHam;
	}
	
	public void setSize(String size){
		Size=size;
	}
	public void getNumberofCheese(int cheese){
		NumberofCheese=cheese;
	}
	public void getNumberofPepperroni(int Pepperroni){
		NumberofPepperroni=Pepperroni;
	}
	public void setNumberofHam(int ham){
		NumberofHam=ham;
	}
	
	public double calcCost(){
		switch(Size){
		case "small":
			return (10+2*NumberofCheese+2*NumberofPepperroni+2*NumberofHam);
		case "medium":
			return (12+2*NumberofCheese+2*NumberofPepperroni+2*NumberofHam);
		case "large":
			return (14+2*NumberofCheese+2*NumberofPepperroni+2*NumberofHam);
		default:
			return 0;
		}
	}
	
	public boolean equals(Pizza pizza){
		if(Size.equals(pizza.getSize()) && NumberofCheese==pizza.getNumberofCheese() && NumberofPepperroni==pizza.getNumberofPepperroni() && NumberofHam==pizza.getNumberofHam())
			return true;
		else
			return false;
	}
	
	public String toString(){
		return "size="+Size+", numOfCheese="+Integer.toString(NumberofCheese)+", numOfPepperroni="+Integer.toString(NumberofPepperroni)+", numOfHam="+Integer.toString(NumberofHam);
	}
}
