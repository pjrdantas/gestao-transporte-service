package br.com.rd.gestaoTransporte.domain;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Entity
@Table(name="TB_FILIAL_COMPLEMENTO")
public class TbFilialComplemento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TB_FILIAL_COMPLEMENTO_CDFILIAL_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TB_FILIAL_COMPLEMENTO_CDFILIAL_GENERATOR")
	@Column(name="CD_FILIAL")
	private Long cdFilial;

	@Column(name="CD_ESTACIONAMENTO_POSICAO")
	private BigDecimal cdEstacionamentoPosicao;

	@Column(name="CD_FILIAL_FORMATO_COMERCIAL")
	private BigDecimal cdFilialFormatoComercial;

	@Column(name="CD_MODELO_ARQUITETONICO")
	private BigDecimal cdModeloArquitetonico;

	@Column(name="CD_SAZONALIDADE")
	private BigDecimal cdSazonalidade;

	@Column(name="CDS_TAMANHO")
	private String cdsTamanho;

	@Column(name="CDS_TOKEN_DEVICE")
	private String cdsTokenDevice;

	@Column(name="DS_BAIRRO_APP")
	private String dsBairroApp;

	@Column(name="DS_CIDADE_APP")
	private String dsCidadeApp;

	@Column(name="DS_ENDERECO_APP")
	private String dsEnderecoApp;

	@Column(name="DS_HORARIO_ESPECIAL")
	private String dsHorarioEspecial;

	@Column(name="DS_INFO_COMPLEMENTAR_APP")
	private String dsInfoComplementarApp;

	@Column(name="DS_REFERENCIA_ENDERECO_APP")
	private String dsReferenciaEnderecoApp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DT_ATIVACAO")
	private Date dtAtivacao;

	@Column(name="FL_AREA_LIVRE_COMERCIO")
	private BigDecimal flAreaLivreComercio;

	@Column(name="FL_ATIVADA")
	private BigDecimal flAtivada;

	@Column(name="FL_PORTICO_MAQUIAGEM")
	private BigDecimal flPorticoMaquiagem;

	@Column(name="FL_SUFRAMA")
	private BigDecimal flSuframa;

	@Column(name="NM_FANTASIA_APP")
	private String nmFantasiaApp;

	@Column(name="NR_CELULAR")
	private String nrCelular;

	@Column(name="NR_DDD_CELULAR")
	private String nrDddCelular;

	@Column(name="NR_DIA_PRECO_ESPECIAL_MAX")
	private BigDecimal nrDiaPrecoEspecialMax;

	@Column(name="NR_DIA_PRECO_ESPECIAL_MIN")
	private BigDecimal nrDiaPrecoEspecialMin;

	@Column(name="NR_INSCRICAO_SUFRAMA")
	private BigDecimal nrInscricaoSuframa;

	@Column(name="QT_BALCAO")
	private BigDecimal qtBalcao;

	@Column(name="QT_CHECKOUT")
	private BigDecimal qtCheckout;

	@Column(name="QT_UNIDADES_EXCEDENTES")
	private BigDecimal qtUnidadesExcedentes;

	@Column(name="TX_URL_PLANTA_FILIAL")
	private String txUrlPlantaFilial;

	public TbFilialComplemento() {
	}


}