package com._tdspr.brunoburian.usecase.Impl;

import com._tdspr.brunoburian.domains.Aluno;
import com._tdspr.brunoburian.usecase.CadastrarAluno;

public class CadastrarAlunoImpl implements CadastrarAluno {
    @Override
    public Aluno executar(Aluno alunoParaCadastrar) {

        Aluno alunoCadastrado = new Aluno();

        alunoCadastrado.setPrimeiroNome(alunoParaCadastrar.getPrimeiroNome());
        alunoCadastrado.setSobrenome(alunoParaCadastrar.getSobrenome());
        alunoCadastrado.setRegistro(alunoParaCadastrar.getRegistro());
        alunoCadastrado.setDocumento(alunoParaCadastrar.getDocumento());

        return alunoCadastrado;
    }
}
