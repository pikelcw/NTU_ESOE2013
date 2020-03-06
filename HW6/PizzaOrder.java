
public class PizzaOrder {
	private int NumberofPizzas;
	private Pizza[] Pizzas=new Pizza[3];
	
	public boolean setNumberPizzas(int No){
		if(No<=3 && No>=1){
			NumberofPizzas=No;
			return true;
		}
		else
			return false;
	}
	public void setPizza1(Pizza pizza){
		Pizzas[0]=new Pizza(pizza);
	}
	public void setPizza2(Pizza pizza){
		Pizzas[1]=new Pizza(pizza);	
	}
	public void setPizza3(Pizza pizza){
		Pizzas[2]=new Pizza(pizza);
	}
	public double calcTotal(){
		double result=0;
		for(int i=0;i<NumberofPizzas;i++){
			result=result + this.Pizzas[i].calcCost();
		}
		return result;
	}
}
