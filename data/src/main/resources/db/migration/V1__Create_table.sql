CREATE SCHEMA [CADSPC]
GO

CREATE TABLE [CORP].[CADSPC].[PLANOS_BENEFICIOS] (
    [ID_SIT_PLANO] numeric(4,0),
    [NM_SIT_PRINCIPAL_PLANO] nvarchar(50),
    [NM_SIT_SECUNDARIA_PLANO] nvarchar(70)
)
GO

CREATE TABLE [CORP].[CADSPC].[SITUACOES_PLANO] (
    [ID_PLANO] numeric(6,0),
    [ID_SIT_PLANO] numeric(4,0),
    [NU_CNPB] numeric(10,0),
    [NM_PLANO] nvarchar(100),
    [SG_PLANO] nvarchar(40),
    [CS_MODALIDADE_PLANO] numeric(1,0),
    [IN_CONTRIB_NORMAL_PARTIC] nvarchar(1),
    [IN_CONTRIB_NORMAL_ASSIST] nvarchar(1),
    [IN_CONTRIB_NORMAL_PATROC] nvarchar(1),
    [IN_DESP_ADM_PARTIC] nvarchar(1),
    [IN_DESP_ADM_ASSIST] nvarchar(1),
    [IN_DESP_ADM_PATROC] nvarchar(1),
    [CS_PLANO_PATROC_INSTIT] numeric(1,0),
    [DT_AUTORIZ_PLANO] datetime2(7),
    [IN_RISCO_MUTUALISTA] nvarchar(1),
    [IN_PLANO_PREVIDENCIAL] nvarchar(1),
    [IN_LIMITE_MAX_SAL] nvarchar(1),
    [CS_FUNDAMENTACAO_LEGAL] numeric(1,0),
    [IN_CONTRIB_SERV_PASSADO_PARTIC] nvarchar(1),
    [IN_CONTRIB_SERV_PASSADO_ASSIST] nvarchar(1),
    [IN_CONTRIB_SERV_PASSADO_PATROC] nvarchar(1),
    [DT_ATUALIZACAO] datetime2(7),
    [NU_USUARIO_ATUALIZACAO] nvarchar(12),
    [DT_APROV_PLANO] datetime2(7),
    [DT_INI_FUNC_PLANO] datetime2(7),
    [DT_FECHA_MASSA_PLANO] datetime2(7),
    [DT_ENCER_EXTINCAO_PLANO] datetime2(7),
    [DT_VALIDACAO] datetime2(7),
    [NU_USUARIO_VALIDACAO] nvarchar(12),
    [TE_DETALHE_LIMITE_MAX_SAL] nvarchar(1000),
    [ID_IMG_OUTROS_DOC] numeric(6,0),
    [TE_MODELO_CERTIFICADO] nvarchar(20)
)
GO

CREATE TABLE [CADSPC].[EFPCS](
	[NU_MATRICULA_EFPC] [numeric](5, 0) NOT NULL,
	[SG_EFPC] [nvarchar](60) NOT NULL,
	[QT_MAX_DIRETORES_EXEC] [numeric](3, 0) NOT NULL,
	[QT_MAX_CONSELHEIRO_FISCAL] [numeric](3, 0) NOT NULL,
	[QT_MAX_CONSELHEIRO_DELIB] [float] NOT NULL,
	[CS_FUNDAMENTACAO_LEGAL] [numeric](1, 0) NULL,
	[CS_TIPO_EFPC] [numeric](1, 0) NOT NULL,
	[DT_APROVACAO_EFPC] [datetime2](7) NULL,
	[DT_INICIO_FUNC] [datetime2](7) NULL,
	[DT_ENCERRAMENTO_EFPC] [datetime2](7) NULL,
	[ID_PJ_SPC] [numeric](6, 0) NOT NULL,
	[ID_SIT_EFPC] [numeric](4, 0) NOT NULL,
	[CS_PATROCINIO_PREDOMINANTE] [numeric](2, 0) NULL,
	[NU_PROCESSO_EFPC] [numeric](17, 0) NULL,
	[TE_EXPEDIENTE_FUNC] [nvarchar](20) NULL,
	[ID_IMG_OUTROS_DOC] [numeric](6, 0) NULL
)
GO

CREATE TABLE [CADSPC].[PESSOAS_JURIDICAS_SPC](
	[ID_PJ_SPC] [numeric](6, 0) NOT NULL,
	[ID_EMPRESA] [numeric](8, 0) NULL,
	[IN_PJ_NACIONAL] [nvarchar](1) NOT NULL,
	[DT_CADASTRO_PJ] [datetime2](7) NOT NULL,
	[DT_ATUALIZACAO_PJ] [datetime2](7) NOT NULL,
	[IN_VALIDADO_CNIS] [nvarchar](1) NOT NULL,
	[IN_EXCLUIDO] [nvarchar](1) NOT NULL,
	[NU_CNPJ] [numeric](14, 0) NULL,
	[NU_PROCESSO_EFPC] [numeric](17, 0) NULL,
	[NU_REGISTRO_FISCAL] [nvarchar](20) NULL,
	[NM_RAZAO_SOCIAL] [nvarchar](100) NULL,
	[NM_FANTASIA] [nvarchar](100) NULL,
	[TE_ENDERECO] [nvarchar](100) NULL,
	[NU_NUMERO_END] [nvarchar](10) NULL,
	[TE_COMPLEMENTO] [nvarchar](30) NULL,
	[NM_BAIRRO] [nvarchar](30) NULL,
	[NM_MUNICIPIO] [nvarchar](60) NULL,
	[NU_CEP] [numeric](8, 0) NULL,
	[SG_UF] [nvarchar](2) NULL,
	[NM_PAIS] [nvarchar](20) NULL,
	[NU_FONE] [nvarchar](20) NULL,
	[NU_FAX] [nvarchar](20) NULL,
	[TE_EMAIL] [nvarchar](100) NULL,
	[TE_SITE] [nvarchar](100) NULL,
	[CS_NATUREZA_JURIDICA_SPC] [numeric](2, 0) NULL,
	[NU_USUARIO_ATUALIZACAO] [nvarchar](12) NULL,
	[TE_OBSERVACAO] [nvarchar](300) NULL
) ON [PRIMARY]

GO



