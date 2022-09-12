package pacote2;

import pacote1.ClasseA; // ATenção!!!!!!
//import pacote1.*;

public class ClasseC {
	public ClasseC() {
		ClasseA aa = new ClasseA();
		aa.v1 = 1;
		aa.v3 = 3; // ERRO DE COMPILAÇÃO
		aa.v2 = 2; // ERRO DE COMPILAÇÃO
	}
}
