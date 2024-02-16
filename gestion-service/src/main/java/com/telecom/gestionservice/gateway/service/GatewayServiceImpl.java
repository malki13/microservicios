package com.telecom.gestionservice.gateway.service;

import com.telecom.gestionservice.gateway.data.dto.GatewayDTO;
import com.telecom.gestionservice.gateway.data.info.GatewayInfo;
import com.telecom.gestionservice.gateway.data.read.GatewayRead;
import com.telecom.gestionservice.gateway.mapper.GatewayMapper;
import com.telecom.gestionservice.gateway.repository.GatewayCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GatewayServiceImpl implements GatewayService{
    @Autowired
    private GatewayCrudRepository gatewayCrudRepository;
    @Autowired
    private GatewayMapper mapper;
    @Override
    public Page<GatewayInfo> findAll(Pageable pageable) {
        return gatewayCrudRepository.findAll(pageable).map(gateway -> mapper.toGatewayInfo(gateway));
    }

    @Override
    public Optional<GatewayRead> getOne(Integer id) {
        return Optional.empty();
    }

    @Override
    public GatewayRead save(Integer empresaId, GatewayDTO gatewayDTO) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public GatewayRead update(Integer empresaId, GatewayDTO gatewayDTO, Integer id) {
        return null;
    }
}
