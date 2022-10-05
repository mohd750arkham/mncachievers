package mnc;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch case
				int day=4;
				
				switch(day) {
				default:{
					System.out.println("enough...");
					break;
				}
				case 1:{
					System.out.println("sunday...");
					break;
				}
				case 2:{
					System.out.println("monday...");
					break;
				}
				case 3:{
					System.out.println("tuesday...");
					
				}
				
				}
				
				String sday="monday";//this support of string switch case was introduced in jdk5
				
				switch(sday) {
				case "sunday":{
					System.out.println("this is first day...1111111");
					break;
				}
				case "monday":{
					System.out.println("this is second day...22222");
					break;
				}
				case "tuesday":{
					System.out.println("this is third day...3333");
					break;
				}
				default:{
					System.out.println("default...");
				}
				
				}
				
				char c='v';
				switch(c) {
				case 'a':{
					System.out.println("a for apple....");
					break;
				}
				case 'b':{
					System.out.println("b for bat.....");
					break;
				}
				default:{
					System.out.println("bla bla");
				}
				}
	}

}
