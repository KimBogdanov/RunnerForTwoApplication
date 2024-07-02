package ru.gazprombank.payhub.middleservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gazprombank.payhub.middleservice.dto.CreateTransferRequestDto;
import ru.gazprombank.payhub.middleservice.dto.TransferResponse;

@FeignClient(name = "transferClientMiddle", url = "${backend-server.url}")
public interface TransferClientMiddle {
    @PostMapping("/v2/transfers")
    TransferResponse create(@RequestBody CreateTransferRequestDto createTransferRequestDto);
}
