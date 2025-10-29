import java.util.Scanner;

public class contador_de_votos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do scanner, fundamental para ler os dados informados pelo usuário 
        int quant_votos_edson = 0, quant_votos_mikael = 0, quant_votos_emerson = 0, quant_votos_nulos = 0, voto; // tipagem das variáveis e acumuladores que serão utilizadas para computador os votos dos eleitores, bem como o voto informado pelo usuário que serão números inteiros, somente

        System.out.println("URNA ELETRÔNICA"); // mensagens de personalização
        System.out.println("ELEIÇÕES ESTADUAIS 2026!");
        System.out.println("Seu voto é importante, pois ele garante seus direitos como cidadão brasileiro!");

        // estrutura While, fundamental para a primeira parte do algoritmo de votação 
        while (true) { // enquanto a condição sempre verdadeira 
            System.out.println("VOTE '51' - Edson Pinguço - PARTIDO: DVA"); // mensans de personalização
            System.out.println("VOTE '93' - Mikael Lambe Sal - PARTIDO: PTB");
            System.out.println("VOTE '69' - Emerson Gostosa - PARTIDO: ESPERANÇA");
            System.out.print("Voto: ");
            voto = ler.nextInt(); // variável voto, informado diretamente para o usuário, um tipo de dado inteiro
            if (voto == 0) { // se o voto for 0, força a parada do laço de repetição While
                break;
            }
            else { // caso contrário é necessário realziar a contabilização dos votos
                switch (voto) { // switch case, selhante a estrutura match implementada no Python3
                    case 51: // caso o voto informado seja 51 ele irá incrementar uma unidade para o candidato 'edson' e confirmar a votação no candidato
                        quant_votos_edson += 1;
                        System.out.println("Voto em EDSON PINGUÇO realizado!");
                        break; // o break é fundamental a cada ação, sua ausência faça com que caia para o caso 93, emparalhando tudo

                    case 93:
                        quant_votos_mikael += 1; // incrementando na variável do candidato mikael
                        System.out.println("Voto em MIKAEL LAMBE SAL realizado!");
                        break;

                    case 69:
                        quant_votos_mikael += 1;  // incrementando na variável do candidato emerson 
                        System.out.println("Voto em EMERSON GOSTOSA  realizado!");
                        break;
                
                    default: // caso contrário, se o usuário informar um número que não condiz com os valores do candidado será considerado um voto nulo
                        System.out.println("VOTO NULO");
                        quant_votos_nulos += 1;
                        break;
                }
            }
        }
        ler.close(); // fechamento do scanner, pois não será mais necessário

        // segunda parte do algoritmo, decisões de quem venceu as eleições
        if (quant_votos_edson > quant_votos_emerson && quant_votos_edson > quant_votos_mikael) { //primeiro caso refere-se a vitória do candidato edson
            System.out.println("DEPUTADO FEDERAL: EDSON PINGUÇO VENCEU A ELEIÇÃO! VIVA À DEMOCRACIA!");
        }
        else if (quant_votos_emerson > quant_votos_edson && quant_votos_emerson > quant_votos_mikael) { //primeiro caso refere-se a vitória do candidato emerson
            System.out.println("DEPUTADO FEDERAL: EMERSON GOSTOSA VENCEU A ELEIÇÃO!");
        }
        else if (quant_votos_mikael > quant_votos_edson && quant_votos_mikael > quant_votos_emerson) {//primeiro caso refere-se a vitória do candidato mikael
            System.out.println("DEPUTADO FEDERAL: MIKAEL LAMBE SAL VENCEU A ELEIÇÃO!");
        }
        else {
            System.out.println("SEGUNDO TURNO!"); // senão, será necessário um segundo turno
        }
    }
}
