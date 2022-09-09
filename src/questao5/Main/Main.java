package questao5.Main;

import questao5.Model.EquipamentoSonoro;
import java.util.Scanner;

public class Main {
    private static Scanner entrada = new Scanner(System.in);
    private static EquipamentoSonoro[] equipamentos = new EquipamentoSonoro[6];
    private static int equipamentoIndex;
    private static int equipamentoNum;
    private static String equipamentoStatus;
    private static int volPrejudicial = 0;

    public static void main(String[] args) {
        for (int i = 0; i < equipamentos.length; i++) {
            EquipamentoSonoro equip = new EquipamentoSonoro(0);
            equipamentos[i] = equip;
        }
        menu();
    }

    public static void menu() {
        System.out.println("-------------------------------------------------");
        System.out.println("---------------LISTA DE EQUIPAMENTOS-------------");
        System.out.println("-------------------------------------------------");
        System.out.println("********** Escolha um dos equipamentos **********");

        for (int i = 0; i < equipamentos.length; i++) {
            if (equipamentos[i].isLigado() == true) {
                equipamentoStatus = "Ligado";
            } else {
                equipamentoStatus = "Desligado";
            }

            equipamentoNum = i + 1;

            System.out.println("  |   Equipamento " + equipamentoNum + " - " + equipamentoStatus + " / Volume: "
                    + equipamentos[i].getVolume() + "   |");
        }
        System.out.println("  |            Digite 0 para sair             |");
        System.out.print("Digite o número do aparelho que deseja manipular: ");
        equipamentoIndex = entrada.nextInt();

        switch (equipamentoIndex) {
            case 0:
                quit();
                break;
            case 1:
                manipularEquipamento(0);
                break;
            case 2:
                manipularEquipamento(1);
                break;
            case 3:
                manipularEquipamento(2);
                break;
            case 4:
                manipularEquipamento(3);
                break;
            case 5:
                manipularEquipamento(4);
                break;
            case 6:
                manipularEquipamento(5);
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }
    }

    public static void manipularEquipamento(int index) {
        System.out.println("\n\n**************** Opções disponíveis ****************");
        System.out.println("1 - Ligar ");
        System.out.println("2 - Desligar ");
        System.out.println("3 - Aumentar volume ");
        System.out.println("4 - Abaixar volume ");
        System.out.print("Digite o número a ação: ");
        equipamentoIndex = entrada.nextInt();

        switch (equipamentoIndex) {
            case 1:
                equipamentos[index].ligar();
                menu();
                break;
            case 2:
                equipamentos[index].desligar();
                menu();
                break;
            case 3:
                equipamentos[index].aumentarVol();
                menu();
                break;
            case 4:
                equipamentos[index].diminuirVol();
                menu();
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
        }

    }

    public static void quit() {
        for (int i = 0; i < equipamentos.length; i++) {

            if (equipamentos[i].getVolume() > 8) {
                volPrejudicial++;
            }
        }

        volPrejudicial = (volPrejudicial * 100) / 6;

        if (volPrejudicial > 0) {
            System.out.println("\nAlerta!!! " + volPrejudicial + "% dos seus aparelhos possuem volumes acima de 80 decibéis");
        } else {
            System.out.println("\nTodos os seus aparelhos estão abaixo do volume prejudicial à audição!!");
        }
    }

}
