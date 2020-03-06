import java.math.BigDecimal;
import java.text.DecimalFormat;

public class SimpleCalculator {
	private double result;
	private double number;
	int state=1;
	public double getNumber() {
		return number;
	}

	public char getOperator() {
		return operator;
	}

	private char operator;
	private int step=0;
	
	//TODO: any other variables are optional here.

	public void calResult(String cmd) throws UnknownCmdException {
		step++;
		boolean isNumber=true;
		char space='/';
		double number=0.0;
		char operator='!';
		
		try{
		space=cmd.charAt(1);
		}
		catch(StringIndexOutOfBoundsException f){
			throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
		}
		if(space!=' ')
			throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
		for(int i=2;i<cmd.length();i++){
			if(cmd.charAt(i)==' ')
				throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
		}
		try{
			operator=cmd.charAt(0);
			}
		catch(StringIndexOutOfBoundsException e){
			}
		
		try{
		Double.parseDouble(cmd.substring(2));
		number=Double.parseDouble(cmd.substring(2));
		}
		catch(Exception e){
			//number=cmd.substring(2);
			isNumber=false;
		}
		
		if(operator!='+'&&operator!='-'&&operator!='*'&&operator!='/'&&!isNumber)
			throw new UnknownCmdException(cmd.charAt(0)+" is an unknown operator and "+cmd.substring(2)+" is an unknown value");
		if(operator!='+'&&operator!='-'&&operator!='*'&&operator!='/')
			throw new UnknownCmdException(cmd.charAt(0)+" is an unknown operator");
		if(!isNumber)
			throw new UnknownCmdException(cmd.substring(2)+" is an unknown value");
		
		
			switch(operator){
				case '+':
					result+=number;
					break;
				case '-':
					result-=number;
					break;
				case '*':
					result*=number;
					break;
				case '/':
					if(number==0){
						throw new UnknownCmdException("Can not divide by 0");
					}
					result/=number;
					break;
			}
			this.operator=operator;
			this.number=number;
			
	}

	public String getMsg() {
		//System.out.println(state);
		if(step==-1)
			return "Final result = "+new BigDecimal((new DecimalFormat("#.0#").format(result)));
		else if(step==0)
			return "Calculator is on. Result = "+new BigDecimal((new DecimalFormat("#.0#").format(result)));
		else if(step==1)
			return "Result "+operator+" "+new BigDecimal((new DecimalFormat("#.0#").format(number)))+" = "+new BigDecimal((new DecimalFormat("#.0#").format(result)))+". New result = "+new BigDecimal((new DecimalFormat("#.0#").format(result)));
		else
			return "Result "+operator+" "+new BigDecimal((new DecimalFormat("#.0#").format(number)))+" = "+new BigDecimal((new DecimalFormat("#.0#").format(result)))+". Updated result = "+new BigDecimal((new DecimalFormat("#.0#").format(result)));
	}

	public boolean endCalc(String cmd) {
		if(cmd.length()==1 && (cmd.charAt(0)=='R'||cmd.charAt(0)=='r')){
			step=-1;
			return true;
		}		
		else
			return false;
	}

	
	// TODO: any other methods are optional here.

}