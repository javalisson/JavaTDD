package javabanco.entidade;

import java.util.ArrayList;

public class ContaCorrente {
	private float _saldo = 0;
	private ArrayList<Float> _operacoes = new ArrayList<Float>();
	public float saldo(){
		return _saldo;
	}
	
	public float credito(float valor) {
		if (valor <= 0) throw new IllegalArgumentException("O valor da operacao deve ser maior que zero");
		_saldo += valor;
		_operacoes.add(valor);
		return _saldo;
	}
	
	public float debito(float valor) {
		if (valor <= 0) throw new IllegalArgumentException("O valor da operacao deve ser maior que zero");
		_saldo -= valor;
		_operacoes.add(-valor);
		return _saldo;
	}
	
	public ArrayList<Float> extrato() {
		return _operacoes;
	}
}
