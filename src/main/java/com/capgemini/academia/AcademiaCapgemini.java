package com.capgemini.academia;

import com.capgemini.academia.service.QuestaoDoisService;
import com.capgemini.academia.service.QuestaoTresService;
import com.capgemini.academia.service.QuestaoUmService;

public class AcademiaCapgemini {

    public static void main(String[] args) {

        QuestaoUmService questaoUmService = new QuestaoUmService();
        QuestaoDoisService questaoDoisService = new QuestaoDoisService();
        QuestaoTresService questaoTresService = new QuestaoTresService();

        //Teste questão um
        int arr[] = { 9, 2, 1, 4, 6 };
        System.out.println(questaoUmService.recuperarMediana(arr));

        //Teste questão dois
        int[] n = { 1, 5, 3, 4, 2 };
        System.out.println(questaoDoisService.calcularQuantidadePares(n, 2));

        //Teste questão três
        System.out.println(questaoTresService.encriptarTexto("tenha um bom dia"));
        System.out.println(questaoTresService.encriptarTexto("ola mundo"));

    }

}
