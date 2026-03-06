package com.devmagalu.agendamento_notificacao_api.business;

import com.devmagalu.agendamento_notificacao_api.business.mapper.IAgendamentoMapper;
import com.devmagalu.agendamento_notificacao_api.controllers.dtos.in.AgendamentoRecord;
import com.devmagalu.agendamento_notificacao_api.controllers.dtos.out.AgendamentoRecordOut;
import com.devmagalu.agendamento_notificacao_api.exception.NotFoundException;
import com.devmagalu.agendamento_notificacao_api.infra.repositories.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;
    private final IAgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamento){
        return agendamentoMapper.paraOut(
                repository.save(
                        agendamentoMapper.paraEntity(agendamento)));
    }

    public AgendamentoRecordOut buscarAgendamentoPorId(Long id){
        return  agendamentoMapper.paraOut(repository.findById(id)
                .orElseThrow(()-> new NotFoundException("Id não encontrado")));
    }

}
