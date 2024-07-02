package ru.gazprombank.payhub.middleservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gazprombank.payhub.middleservice.dto.CreateUserRequestDto;

@FeignClient(name = "userClientMiddle", url = "${backend-server.url}")
public interface UserClientMiddle {
    @PostMapping("/v2/users")
    void create(@RequestBody CreateUserRequestDto userRequestDto);
}
