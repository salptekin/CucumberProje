package day35interfacedt;

public class Family extends Hotel {

	public static void main(String[] args) {

	}

	@Override
	public void breakfast() {
		System.out.println("Breakfast with family");	
	}

	@Override
	public void clean() {
		System.out.println("Clean family room");		
	}

	@Override
	public void bInRoom() {
        System.out.println("Breakfast in the room is good");
	}

}
