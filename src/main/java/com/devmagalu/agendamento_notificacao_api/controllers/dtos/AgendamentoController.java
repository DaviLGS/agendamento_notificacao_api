package com.devmagalu.agendamento_notificacao_api.controllers.dtos;

import com.devmagalu.agendamento_notificacao_api.business.AgendamentoService;
import com.devmagalu.agendamento_notificacao_api.controllers.dtos.in.AgendamentoRecord;
import com.devmagalu.agendamento_notificacao_api.controllers.dtos.out.AgendamentoRecordOut;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamento")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamentos(@RequestBody AgendamentoRecord agendamento){
        return  ResponseEntity.ok(
                agendamentoService.gravarAgendamento(agendamento));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AgendamentoRecordOut> buscarAgendamentoPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(agendamentoService.buscarAgendamentoPorId(id));
    }
}
