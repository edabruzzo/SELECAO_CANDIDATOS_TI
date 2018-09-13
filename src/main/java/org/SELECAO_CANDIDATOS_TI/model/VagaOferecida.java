package org.SELECAO_CANDIDATOS_TI.model;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "tb_vaga")
public class VagaOferecida implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vaga", updatable = false, nullable = false)
    private Integer idVaga;
    
    
    private String nomeEmpresa;

    @Enumerated(EnumType.STRING)
    private Cargos posicaoOferecida;

    @Enumerated(EnumType.STRING)
    private DominioIngles nivelInglesExigido;

    //Tempo em anos
    private Integer experienciaExigida;

    @Enumerated(EnumType.STRING)
    private FormacaoAcademica formacaoAcademica;

    @Enumerated(EnumType.STRING)
    private UniversidadeFormacao universidadeFormacao;

    @Enumerated(EnumType.STRING)
    private List<Cargos> posicaoOferecida;

    @Enumerated(EnumType.STRING)
    private DominioIngles nivelInglesExigido;

    @CollectionOfElements(targetElement = TecnologiasDominadas.class, fetch = FetchType.EAGER)
    @JoinTable(name = "tb_tecnologia_dominada", joinColumns = @JoinColumn(name = "idTecnologiaDominada"))
    @Column(name = "tecnologiaDominada", nullable = false)
    @Enumerated(EnumType.STRING)
    private List<TecnologiasDominadas> tecnologiasDominadas;

    public Integer getIdVaga() {
        return idVaga;
    }

    public void setIdVaga(Integer idVaga) {
        this.idVaga = idVaga;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Cargos getPosicaoOferecida() {
        return posicaoOferecida;
    }

    public void setPosicaoOferecida(Cargos posicaoOferecida) {
        this.posicaoOferecida = posicaoOferecida;
    }

    public DominioIngles getNivelInglesExigido() {
        return nivelInglesExigido;
    }

    public void setNivelInglesExigido(DominioIngles nivelInglesExigido) {
        this.nivelInglesExigido = nivelInglesExigido;
    }

    public Integer getExperienciaExigida() {
        return experienciaExigida;
    }

    public void setExperienciaExigida(Integer experienciaExigida) {
        this.experienciaExigida = experienciaExigida;
    }

    public FormacaoAcademica getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public UniversidadeFormacao getUniversidadeFormacao() {
        return universidadeFormacao;
    }

    public void setUniversidadeFormacao(UniversidadeFormacao universidadeFormacao) {
        this.universidadeFormacao = universidadeFormacao;
    }

    public List<Cargos> getCargoOferecidoVaga() {
        return cargoOferecidoVaga;
    }

    public void setCargoOferecidoVaga(List<Cargos> cargoOferecidoVaga) {
        this.cargoOferecidoVaga = cargoOferecidoVaga;
    }

    public List<TecnologiasDominadas> getTecnologiasDominadas() {
        return tecnologiasDominadas;
    }

    public void setTecnologiasDominadas(List<TecnologiasDominadas> tecnologiasDominadas) {
        this.tecnologiasDominadas = tecnologiasDominadas;
    }

    
    
    
    
}
