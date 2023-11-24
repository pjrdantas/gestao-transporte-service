package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_PERFIL")
public class TbPerfil implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_PERFIL")
	private BigDecimal idPerfil;

	@Column(name="CD_DEPARTAMENTO")
	private BigDecimal cdDepartamento;

	@Column(name="CD_OPERADOR")
	private BigDecimal cdOperador;

	@Column(name="DS_PERFIL")
	private String dsPerfil;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATUALIZACAO")
	private Date dtAtualizacao;

	@Column(name="FL_ADMIN")
	private BigDecimal flAdmin;

	@Column(name="FL_INATIVO")
	private BigDecimal flInativo;

	@Column(name="NR_NIVEL_ACESSO")
	private BigDecimal nrNivelAcesso;

	@OneToMany(mappedBy="tbPerfil")
	private List<TbMenuItemAcesso> tbMenuItemAcessos;

	@OneToMany(mappedBy="tbPerfil")
	private List<TbOperadorPerfil> tbOperadorPerfils;

	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="TB_MENU_ACESSO"
		, joinColumns={
			@JoinColumn(name="ID_PERFIL", referencedColumnName="ID_PERFIL", nullable = false, insertable = false, updatable = false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="CD_MENU", referencedColumnName="CD_MENU", nullable = false, insertable = false, updatable = false)
			}
		)
	private List<TbMenu> tbMenus;

	@ManyToOne
	@JoinColumn(name="CD_PERFIL_TIPO", referencedColumnName="CD_PERFIL_TIPO", nullable = false, insertable = false, updatable = false)
	private TbPerfilTipo tbPerfilTipo;

	public TbPerfil() {
	}

}