package com.toblerones.parking.meters.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-11-25T22:07:29.638+11:00[Australia/Sydney]")

@Controller
@RequestMapping("${openapi.parkingMeters.base-path:/v1}")
public class ParkingInfoApiController implements ParkingInfoApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ParkingInfoApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
