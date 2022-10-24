package classeAbstract;

public abstract class Mamifero extends Animal{

	/* a classe Mamifero é abstrada assim como a classe-mae Animal
	*	Por isso, Mamifero não é obrigada a implementar o método abstrado fazBarulho
 	*
	*/
	
	@Override
	public void fazerBarulho() {
		System.out.println("Barulho de um mamífero");
		
	}
	
}
