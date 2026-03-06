package com.devmagalu.agendamento_notificacao_api.business.mapper;

import com.devmagalu.agendamento_notificacao_api.controllers.dtos.in.AgendamentoRecord;
import com.devmagalu.agendamento_notificacao_api.controllers.dtos.out.AgendamentoRecordOut;
import com.devmagalu.agendamento_notificacao_api.infra.entities.Agendamento;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IAgendamentoMapper {

    Agendamento paraEntity(AgendamentoRecord agendamento);

    AgendamentoRecordOut paraOut(Agendamento agendamento);

}
