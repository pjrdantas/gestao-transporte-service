package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_OPERADOR_PERFIL")
public class TbOperadorPerfil implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private TbOperadorPerfilPK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ULTIMA_ALTERACAO")
	private Date dtUltimaAlteracao;

	 
	@ManyToOne
	@JoinColumn(name="CD_OPERADOR", nullable = false, insertable = false, updatable = false)
	private TbOperador tbOperador;

	 
	@ManyToOne
	@JoinColumn(name="ID_PERFIL", referencedColumnName="ID_PERFIL", nullable = false, insertable = false, updatable = false)
	private TbPerfil tbPerfil;

	public TbOperadorPerfil() {
	}

}