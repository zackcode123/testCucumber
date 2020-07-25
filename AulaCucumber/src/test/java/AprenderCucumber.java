import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.ca.Cal;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {

	}

	@Quando("^executá-lo$")
	public void executáLo() throws Throwable {

	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {

	}

	private int contador = 0;

	@Dado("^que o valor do contador é (\\d+)$")
	public void queOValorDoContadorÉ(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar (\\d+)$")
	public void euIncrementar(int arg1) throws Throwable {
		contador = contador + arg1;
	}

	@Então("^o valor do contador séra (\\d+)$")
	public void oValorDoContadorSéra(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);

	}

	Date entrega = new Date();
	@Dado("^que a data de entrega é dia (\\d+)/(\\d+)/(\\d+)$")
	public void queADataDeEntregaÉDia(int dia, int mes, int ano) throws Throwable {
		Calendar  cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
		
	}

	@Quando("^a entrega atrasar (\\d+) dias$")
	public void aEntregaAtrasarDias(int arg1) throws Throwable {
		Calendar  cal = Calendar.getInstance();
		cal.setTime(entrega);
		cal.set(Calendar.DAY_OF_MONTH, arg1);
		entrega = cal.getTime();
	}

	@Então("^a data de entrega sera dia (\\d+)/(\\d+)/(\\d+)$")
	public void aDataDeEntregaSeraDia(int arg1, int arg2, int arg3) throws Throwable {
	
	}
}
