package classeAbstract;

/*
 * Classes abstratas não podem ser instanciadas
 * Métodos abstratos não podem ser implemntados no momento da sua declaração (apenas por herança - sobreposição)
 * Todo método abstrato está em uma classe abstrada
 * Mas nem toda classe abstrada possui método abstrado
 * Se uma classe não-abstrata Cachorro herda de Animal, então a classe Cachorro é OBRIGADA a implementar os métodos abstrados de Animal
 * Se a classe Cachorro também é abstrata, então ela não é obrigada a implementar o método abstrato
 * */

public abstract class Animal {
	int distanciaPercorrida = 0;
	

	public abstract void fazerBarulho(); // método abastrado: sem implementação

	public /*abstract*/ void andar() { // método não abstrado: com implementação
		System.out.println("Animal anda");
		distanciaPercorrida++;
	}

	public void treinar() {
		andar();
		fazerBarulho();//O que aconteceria se o compilador nos deixasse instanciar Animal e
		//tentássemos treinar esse animal?
	}
}
