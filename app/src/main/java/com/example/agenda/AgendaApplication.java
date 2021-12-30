package com.example.agenda;

import android.app.Application;

import com.example.agenda.DAO.AlunoDAO;
import com.example.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("Eduardo", "111111", "eduardo@gmail.com"));
        dao.salva(new Aluno("Aaaa", "222222", "aaaa@gmail.com"));
    }
}
