package pacote1;

public class ClasseB {

	public ClasseB() {
		ClasseA aa = new ClasseA();
		aa.v1 = 1;
		aa.v3 = 3; // ESTA LINHA PASSA PELA COMPIALAÇÃO
		aa.v2 = 2; // ERRO DE COMPILAÇÃO
	}
	
}
