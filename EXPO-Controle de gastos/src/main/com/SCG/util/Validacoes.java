package main.com.SCG.util;

import main.com.SCG.model.Gasto;

public class Validacoes {

    public static String analisarGasto(Gasto gasto) {
        String nome = gasto.getNomegasto().toLowerCase();

        if (nome.contains("comida") || nome.contains("mercado") || nome.contains("supermercado")
                || nome.contains("aluguel") || nome.contains("conta") || nome.contains("luz")
                || nome.contains("água") || nome.contains("internet") || nome.contains("telefone")
                || nome.contains("transporte") || nome.contains("ônibus") || nome.contains("gasolina")
                || nome.contains("remédio") || nome.contains("farmácia") || nome.contains("saúde")
                || nome.contains("plano de saúde") || nome.contains("escola") || nome.contains("faculdade")
                || nome.contains("curso") || nome.contains("livro") || nome.contains("energia")
                || nome.contains("gás") || nome.contains("alimento") || nome.contains("habitação")
                || nome.contains("imposto") || nome.contains("seguro saúde") || nome.contains("seguro de vida")
                || nome.contains("seguro de carro") || nome.contains("educação") || nome.contains("dentista")
                || nome.contains("hospital") || nome.contains("médico") || nome.contains("tratamento")
                || nome.contains("fatura de cartão") || nome.contains("material escolar") || nome.contains("uniforme")
                || nome.contains("creche") || nome.contains("boleto") || nome.contains("condomínio")
                || nome.contains("luz elétrica") || nome.contains("combustível") || nome.contains("pedágio")
                || nome.contains("óculos") || nome.contains("vacina") || nome.contains("nutricionista")
                || nome.contains("psicólogo") || nome.contains("fisioterapia") || nome.contains("academia")) {
            return "Gasto aceitável. Essencial para o dia a dia.";
        }

        else if (nome.contains("lazer") || nome.contains("jogo") || nome.contains("cinema")
                || nome.contains("balada") || nome.contains("delivery") || nome.contains("fast food")
                || nome.contains("roupa") || nome.contains("luxo") || nome.contains("show")
                || nome.contains("viagem") || nome.contains("bar") || nome.contains("restaurante")
                || nome.contains("teatro") || nome.contains("streaming") || nome.contains("netflix")
                || nome.contains("spotify") || nome.contains("games") || nome.contains("compras online")
                || nome.contains("shopping") || nome.contains("assinatura de revista")
                || nome.contains("revista digital") || nome.contains("salão de beleza")
                || nome.contains("maquiagem") || nome.contains("perfume") || nome.contains("parque de diversões")
                || nome.contains("viajem") || nome.contains("resort") || nome.contains("hotel") 
                || nome.contains("joias") || nome.contains("colecionáveis") || nome.contains("celular") 
                || nome.contains("eletrônicos") || nome.contains("carro") || nome.contains("moto") 
                || nome.contains("eletrodoméstico") || nome.contains("sobremesa") || nome.contains("brinquedo") 
                || nome.contains("enfeite") || nome.contains("decoração")
                ) 
                {
            return "Atenção! Se necessário o gasto deve ser reduzido.";
        }

        else if (nome.contains("bebida") || nome.contains("cigarro") || nome.contains("aposta")
            || nome.contains("cassino") || nome.contains("droga") || nome.contains("pôquer")
            || nome.contains("vicio") || nome.contains("tráfico") || nome.contains("ilegal")
            || nome.contains("corrupção") || nome.contains("multas") || nome.contains("prostituição")
            || nome.contains("armas") || nome.contains("contrabando") || nome.contains("lavagem")
            || nome.contains("pirataria") || nome.contains("crime") || nome.contains("suborno")
            || nome.contains("corrida clandestina") || nome.contains("rachas")
            || nome.contains("jogo do bicho") || nome.contains("loteria") || nome.contains("cassino online")
            || nome.contains("tabaco") || nome.contains("narguile") || nome.contains("alcool")
            || nome.contains("drogas ilícitas") || nome.contains("entorpecente")
            || nome.contains("corrida ilegal") || nome.contains("fraude")
            || nome.contains("dinheiro sujo") || nome.contains("corrupção ativa")
            || nome.contains("corrupção passiva") || nome.contains("propina")
            || nome.contains("substância ilícita") || nome.contains("jogo ilegal")
            || nome.contains("lavagem de dinheiro") || nome.contains("organização criminosa")
            || nome.contains("sequestro") || nome.contains("assalto")
            || nome.contains("tráfico humano") || nome.contains("falsificação")
            || nome.contains("contrato ilegal") || nome.contains("estelionato")) {
                
            return "Gasto Prejudicial à sua receita e/ou saúde.";
        }

        else {
            return "Analise seu(s) gasto(s) para saber se é(são) necessário(s).";
        }
    }
}