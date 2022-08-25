package Stacks;

public class StackLLClassUse {
	
	public static void main(String[] args) throws Exception{
		StackLLClass a = new StackLLClass();
		for(int i = 0; i< 5; i++) {
			a.push(i);
		}
		while(!a.isEmpty()) {
			try{
				System.out.println(a.pop());
			}catch(StackEmptyException e){
				//Never Reach here
			}
		}
	}
}
