package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date entrada;
	private Date saida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Reserva(Integer numeroQuarto, Date entrada, Date saida) {
		this.numeroQuarto = numeroQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}
	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}
	public Date getEntrada() {
		return entrada;
	}
	public Date getSaida() {
		return saida;
	}
	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	//m�todo que retorna dia hora e minutos de entrada e saida
	public long duracao() {
		long diff=entrada.getTime()-saida.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	//metodo que atualiza
	public void dataDeAtualizacao(Date entrada,Date saida) {
		this.entrada=entrada;
		this.saida=saida;
	}
	
@Override
public String toString() {
	return "quarto"
			+numeroQuarto
			+",entrada: "
			+sdf.format(entrada)
			+",saida: "
			+sdf.format(saida)
			+" ,"
			+duracao()
			+",noites";
}
}