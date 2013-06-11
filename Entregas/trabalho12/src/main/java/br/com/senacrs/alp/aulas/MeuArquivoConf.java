package br.com.senacrs.alp.aulas;

public class MeuArquivoConf implements Configuracao {

	@Override
	public ArquivoConfiguracao getArquivoConfiguracao() {	
		ArquivoConfiguracao resultado = null;

		resultado = ArquivoConfiguracao.class.cast(config);

		return resultado;
	}

	@Override
	public boolean valido() {
		// TODO Auto-generated method stub
		return false;
	}

}
